package com.github.kija.interpreter;

import com.github.kija.compiler.Type;
import com.github.kija.parser.ast.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Interpreter implements ExprVisitor<Map<String, Var>, Value> {
  private final String[] args;
  private final List<Use> uses;
  private final List<Const> consts;
  private final List<Data> datas;
  private final Map<String, Function> functions;

  public Interpreter(Script script, String[] args) throws IOException {
    this.args = args;
    consts    = script.getConsts();
    datas     = script.getDatas();
    uses      = script.getUses();
    functions = script.getFunctions().stream()
        .collect(Collectors.toMap(Function::getName,
            java.util.function.Function.identity()));
  }

  public void interpret() {
    interpretUses();
    interpretConsts();
    interpretDatas();

    Function function = functions.get("main");
    if (function == null) {
      throw new RuntimeException("No main function found.");
    }
    interpretFunction(function);
  }

  private void interpretUses() {
  }

  private void interpretConsts() {
  }

  private void interpretDatas() {
  }

  private void interpretFunction(Function function) {
    HashMap<String, Var> vars = new HashMap<>();
    function.getBody().accept(this, vars);
  }

  @Override
  public Value visitArrayAccess(ArrayAccessExpr expr, Map<String, Var> vars) {
    return null;
  }

  @Override
  public Value visitArrayAssignment(ArrayAssignmentExpr expr, Map<String, Var> vars) {
    return null;
  }

  @Override
  public Value visitAttrAccess(AttrAccessExpr expr, Map<String, Var> vars) {
    return null;
  }

  @Override
  public Value visitAttrAssignment(AttrAssignmentExpr expr, Map<String, Var> vars) {
    return null;
  }

  @Override
  public Value visitBinary(BinaryExpr expr, Map<String, Var> vars) {
    System.err.println(expr.getExpr());
    System.err.println(expr.getExpr2());
    System.err.println(expr.getKind());
    Value expr1 = expr.getExpr().accept(this, vars);
    Value expr2 = expr.getExpr2().accept(this, vars);
    switch (expr.getKind()) {
      case EQ:
        return new Value(Type.BOOL, null);
      case NE:
        break;
      case LT:
        break;
      case LE:
        break;
      case GT:
        break;
      case GE:
        break;
      case BAND:
        break;
      case BOR:
        break;
    }
    return null;
  }

  @Override
  public Value visitBlock(BlockExpr expr, Map<String, Var> vars) {
    Map<String, Var> blockMap = new BlockVarMap<>(vars);
    Value value = null;
    for (Expr instr : expr.getInstructions()) {
      value = instr.accept(this, blockMap);
    }
    return value;
  }

  @Override
  public Value visitFlowStop(FlowStopExpr expr, Map<String, Var> vars) {
    switch (expr.getKind()) {
      case BREAK:
        throw new UnsupportedOperationException();
      case CONTINUE:
        throw new UnsupportedOperationException();
      case RETURN:
        throw new UnsupportedOperationException();
      case FAIL:
        Value value = expr.getOptionalExpr().accept(this, vars);
        throw new RuntimeException(value.toString());
      default:
        throw new UnsupportedOperationException();
    }
  }

  @Override
  public Value visitFunAccess(FunAccessExpr expr, Map<String, Var> vars) {
    return null;
  }
  
  @Override
  public Value visitFunCall(FunCallExpr expr, Map<String, Var> vars) {
    return null;
  }

  @Override
  public Value visitIf(IfExpr expr, Map<String, Var> vars) {
    return null;
  }

  @Override
  public Value visitIsInstance(IsInstanceExpr expr, Map<String, Var> vars) {
    return null;
  }

  private static Type getTypeOf(Object value) {
    if (value instanceof Boolean) {
      return Type.BOOL;
    }
    if (value instanceof Integer) {
      return Type.INT;
    }
    if (value instanceof Double) {
      return Type.NUM;
    }
    if (value instanceof String) {
      return Type.STR;
    }
    throw new UnsupportedOperationException("This type is not supported.");
  }
  
  @Override
  public Value visitLiteral(LiteralExpr expr, Map<String, Var> vars) {
    Object nonTypedValue = expr.getValue();
    Type type = getTypeOf(nonTypedValue);  
    return new Value(type, nonTypedValue);
  }

  @Override
  public Value visitNewCall(NewCallExpr expr, Map<String, Var> vars) {
    return null;
  }

  @Override
  public Value visitMethodCall(MethodCallExpr expr, Map<String, Var> vars) {
    return null;
  }

  @Override
  public Value visitPrint(PrintExpr expr, Map<String, Var> vars) {
    List<Expr> parameters = expr.getParameters();

    if (parameters.size() != 1) {
      throw new RuntimeException("print takes one argument only");
    }

    Expr parameter = parameters.get(0);
    Value argument = parameter.accept(this, vars);
    System.out.println(argument);
    
    return argument;
  }

  @Override
  public Value visitUnary(UnaryExpr expr, Map<String, Var> vars) {
    return null;
  }

  @Override
  public Value visitVarAccess(VarAccessExpr expr, Map<String, Var> vars) {
    Var var = vars.get(expr.getName());
    if (var == null) {
      throw new RuntimeException("Variable `" + expr.getName() + "` does not exist.");
    }
    return var.getValue();
  }

  @Override
  public Value visitVarAssignment(VarAssignment expr, Map<String, Var> vars) {
    Value value = expr.getExpr().accept(this, vars);
    Var var = new Var(expr.getName(), value);  //FIXME, why did you create a var is a var already exist ??

    if (vars.get(expr.getName()) != null) {   //FIXME, I don't understand this check ??
      throw new RuntimeException("You cannot assign value `" + value +
          "` to variable of type " + value.getType() + ".");
    }
    
    vars.put(expr.getName(), var);
    return value;
  }

  @Override
  public Value visitWhile(WhileExpr expr, Map<String, Var> vars) {
    Value condition = expr.getCondition().accept(this, vars);
    if ((boolean) condition.getValue()) {
      expr.getBody().accept(this, vars);
    }
    return null;
  }
}
