package com.github.kija.grammar.parser;

import com.github.kija.grammar.parser.NonTerminalEnum;
import com.github.kija.grammar.parser.ProductionEnum;
import com.github.kija.grammar.parser.TerminalEnum;
import fr.umlv.tatoo.runtime.parser.AcceptAction;
import fr.umlv.tatoo.runtime.parser.Action;
import fr.umlv.tatoo.runtime.parser.BranchAction;
import fr.umlv.tatoo.runtime.parser.ErrorAction;
import fr.umlv.tatoo.runtime.parser.ExitAction;
import fr.umlv.tatoo.runtime.parser.ParserTable;
import fr.umlv.tatoo.runtime.parser.ReduceAction;
import fr.umlv.tatoo.runtime.parser.ShiftAction;
import fr.umlv.tatoo.runtime.parser.StateMetadata;
import java.util.EnumMap;

/** 
 *  This class is generated - please do not edit it 
 */
public class ParserDataTable {
  private ParserDataTable() {
   accept = AcceptAction.<TerminalEnum,ProductionEnum,VersionEnum>getInstance();
   exit = ExitAction.<TerminalEnum,ProductionEnum,VersionEnum>getInstance();
    initexprGotoes();
    initexpr_star_10_subGotoes();
    initparameterGotoes();
    initblockGotoes();
    initmember_star_0Gotoes();
    initexpr_star_8Gotoes();
    initinstr_star_7Gotoes();
    initscriptGotoes();
    initparameter_star_1Gotoes();
    initexpr_star_9_subGotoes();
    initinstrGotoes();
    initparameter_star_2Gotoes();
    initexpr_plus_6Gotoes();
    initparameter_star_2_subGotoes();
    initexpr_optional_4Gotoes();
    initinstr_star_3Gotoes();
    initexpr_star_9Gotoes();
    initexpr_star_10Gotoes();
    initexpr_star_8_subGotoes();
    initmemberGotoes();
    initexpr_optional_5Gotoes();
    initparameter_star_1_subGotoes();
    reduceparameter_star_1_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_1_through,1,parameter_star_1Gotoes);
    reduceexpr_fun_call = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_fun_call,4,exprGotoes);
    reduceexpr_binary_le = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_le,3,exprGotoes);
    reduceexpr_if = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_if,5,exprGotoes);
    reduceparameter = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter,1,parameterGotoes);
    reduceexpr_star_8_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_8_empty,0,expr_star_8Gotoes);
    reduceinstr_return = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_return,3,instrGotoes);
    reduceuse_member = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.use_member,2,memberGotoes);
    reduceexpr_binary_add = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_add,3,exprGotoes);
    reduceexpr_binary_div = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_div,3,exprGotoes);
    reduceexpr_unary_complement = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_complement,2,exprGotoes);
    reduceconst_member = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.const_member,4,memberGotoes);
    reduceexpr_binary_bor = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_bor,3,exprGotoes);
    reduceexpr_is_instance = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_is_instance,3,exprGotoes);
    reducefun_member = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.fun_member,7,memberGotoes);
    reduceexpr_binary_ge = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_ge,3,exprGotoes);
    reduceexpr_unary_minus = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_minus,2,exprGotoes);
    reduceexpr_method_call = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_method_call,6,exprGotoes);
    reduceexpr_parens = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_parens,3,exprGotoes);
    reduceexpr_binary_xor = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_xor,3,exprGotoes);
    reduceexpr_binary_sub = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_sub,3,exprGotoes);
    reduceexpr_new_call = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_new_call,5,exprGotoes);
    reduceexpr_optional_5_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_optional_5_empty,0,expr_optional_5Gotoes);
    reduceexpr_star_10_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_10_element,1,expr_star_10_subGotoes);
    reduceexpr_orif = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_orif,5,exprGotoes);
    reduceblock = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block,1,blockGotoes);
    reduceexpr_plus_6_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_plus_6_rec,3,expr_plus_6Gotoes);
    reduceexpr_while_else = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_while_else,8,exprGotoes);
    reduceinstr_continue = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_continue,2,instrGotoes);
    reduceinstr_print = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_print,3,instrGotoes);
    reduceexpr_binary_mod = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_mod,3,exprGotoes);
    reduceexpr_star_8_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_8_element,1,expr_star_8_subGotoes);
    reduceinstr_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_expr,2,instrGotoes);
    reduceparameter_star_2_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_2_element,1,parameter_star_2_subGotoes);
    reduceexpr_integer = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_integer,1,exprGotoes);
    reduceexpr_star_10_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_10_rec,3,expr_star_10_subGotoes);
    reduceexpr_binary_band = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_band,3,exprGotoes);
    reduceexpr_optional_5_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_optional_5_expr,1,expr_optional_5Gotoes);
    reduceexpr_star_8_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_8_rec,3,expr_star_8_subGotoes);
    reduceexpr_binary_gt = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_gt,3,exprGotoes);
    reduceexpr_binary_mul = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_mul,3,exprGotoes);
    reduceexpr_var_assignment = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_var_assignment,3,exprGotoes);
    reduceexpr_var_access = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_var_access,1,exprGotoes);
    reduceexpr_unary_plus = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_plus,2,exprGotoes);
    reduceexpr_unary_not = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_not,2,exprGotoes);
    reduceexpr_star_9_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_9_rec,3,expr_star_9_subGotoes);
    reduceexpr_bool = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_bool,1,exprGotoes);
    reduceinstr_star_3_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_star_3_empty,0,instr_star_3Gotoes);
    reduceexpr_plus_6_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_plus_6_element,1,expr_plus_6Gotoes);
    reduceexpr_binary_or = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_or,3,exprGotoes);
    reducemember_star_0_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.member_star_0_rec,2,member_star_0Gotoes);
    reduceexpr_attribute_access = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_attribute_access,3,exprGotoes);
    reduceinstr_star_7_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_star_7_rec,2,instr_star_7Gotoes);
    reduceexpr_star_10_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_10_empty,0,expr_star_10Gotoes);
    reduceexpr_array_assignment = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_array_assignment,6,exprGotoes);
    reduceexpr_star_9_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_9_empty,0,expr_star_9Gotoes);
    reduceexpr_star_9_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_9_through,1,expr_star_9Gotoes);
    reduceexpr_attribute_assignment = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_attribute_assignment,5,exprGotoes);
    reduceexpr_array_access = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_array_access,4,exprGotoes);
    reduceexpr_star_8_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_8_through,1,expr_star_8Gotoes);
    reduceparameter_star_2_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_2_rec,3,parameter_star_2_subGotoes);
    reduceexpr_while = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_while,5,exprGotoes);
    reduceparameter_star_2_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_2_empty,0,parameter_star_2Gotoes);
    reducedata_member = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.data_member,5,memberGotoes);
    reduceexpr_star_10_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_10_through,1,expr_star_10Gotoes);
    reduceexpr_binary_ne = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_ne,3,exprGotoes);
    reduceexpr_if_else = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_if_else,8,exprGotoes);
    reduceexpr_optional_4_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_optional_4_empty,0,expr_optional_4Gotoes);
    reduceexpr_binary_eq = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_eq,3,exprGotoes);
    reduceexpr_null = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_null,1,exprGotoes);
    reduceexpr_binary_lt = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_lt,3,exprGotoes);
    reduceexpr_star_9_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_9_element,1,expr_star_9_subGotoes);
    reduceparameter_star_1_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_1_empty,0,parameter_star_1Gotoes);
    reduceparameter_star_1_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_1_rec,3,parameter_star_1_subGotoes);
    reducemember_star_0_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.member_star_0_empty,0,member_star_0Gotoes);
    reducescript = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.script,1,scriptGotoes);
    reduceexpr_binary_and = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_and,3,exprGotoes);
    reduceinstr_star_7_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_star_7_empty,0,instr_star_7Gotoes);
    reduceexpr_optional_4_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_optional_4_expr,1,expr_optional_4Gotoes);
    reduceexpr_number = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_number,1,exprGotoes);
    reduceexpr_text = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_text,1,exprGotoes);
    reduceinstr_break = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_break,3,instrGotoes);
    reduceinstr_fail = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_fail,3,instrGotoes);
    reduceparameter_star_1_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_1_element,1,parameter_star_1_subGotoes);
    reduceparameter_star_2_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_2_through,1,parameter_star_2Gotoes);
    reduceinstr_star_3_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_star_3_rec,2,instr_star_3Gotoes);
    shift3 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(3);
    shift25 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(25);
    shift149 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(149);
    shift97 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(97);
    shift6 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(6);
    shift85 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(85);
    shift113 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(113);
    shift69 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(69);
    shift4 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(4);
    shift58 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(58);
    shift22 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(22);
    shift20 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(20);
    shift157 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(157);
    shift5 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(5);
    shift119 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(119);
    shift7 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(7);
    shift59 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(59);
    shift95 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(95);
    shift23 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(23);
    shift17 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(17);
    shift138 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(138);
    shift16 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(16);
    shift135 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(135);
    shift24 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(24);
    shift49 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(49);
    shift115 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(115);
    shift75 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(75);
    shift60 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(60);
    shift145 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(145);
    shift39 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(39);
    shift18 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(18);
    shift28 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(28);
    shift124 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(124);
    shift100 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(100);
    shift61 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(61);
    shift121 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(121);
    shift31 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(31);
    shift41 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(41);
    shift29 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(29);
    shift102 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(102);
    shift65 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(65);
    shift111 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(111);
    shift148 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(148);
    shift51 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(51);
    shift15 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(15);
    shift156 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(156);
    shift12 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(12);
    shift87 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(87);
    shift32 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(32);
    shift92 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(92);
    shift136 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(136);
    shift114 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(114);
    shift133 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(133);
    shift131 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(131);
    shift73 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(73);
    shift21 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(21);
    shift106 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(106);
    shift152 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(152);
    shift139 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(139);
    shift117 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(117);
    shift71 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(71);
    shift2 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(2);
    shift14 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(14);
    shift142 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(142);
    shift80 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(80);
    shift27 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(27);
    shift67 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(67);
    shift107 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(107);
    shift47 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(47);
    shift63 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(63);
    shift30 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(30);
    shift150 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(150);
    shift45 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(45);
    shift35 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(35);
    shift57 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(57);
    shift10 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(10);
    shift127 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(127);
    shift43 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(43);
    shift26 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(26);
    shift55 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(55);
    shift33 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(33);
    shift19 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(19);
    shift77 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(77);
    shift53 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(53);
    shift84 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(84);
    shift110 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(110);
    shift93 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(93);
    shift90 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(90);
    shift82 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(82);
    shift103 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(103);
    shift37 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(37);
    error0 = new ErrorAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    branch0 = new BranchAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    initnulzArray();
    init_newArray();
    initcommaArray();
    initdataArray();
    init_constArray();
    initeqArray();
    initpipeArray();
    initloptArray();
    initrparArray();
    initcolonArray();
    initbangArray();
    initltArray();
    inittextArray();
    initampArray();
    initeolArray();
    initprintArray();
    init_elseArray();
    initleArray();
    initisArray();
    initendArray();
    initidArray();
    init_returnArray();
    initnumberArray();
    initdampArray();
    init_whileArray();
    initplusArray();
    initslashArray();
    initmodArray();
    init_continueArray();
    initboolArray();
    initstarArray();
    initintegerArray();
    initdefArray();
    initdpipeArray();
    initxorArray();
    initgeArray();
    initorArray();
    init__eof__Array();
    inituseArray();
    initroptArray();
    initassignArray();
    init_ifArray();
    init_breakArray();
    initlparArray();
    initdotArray();
    initgtArray();
    initminusArray();
    initneArray();
    initfailArray();
    EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]> tableMap =
      new EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]>(TerminalEnum.class);
      
    tableMap.put(TerminalEnum.nulz,nulzArray);
    tableMap.put(TerminalEnum._new,_newArray);
    tableMap.put(TerminalEnum.comma,commaArray);
    tableMap.put(TerminalEnum.data,dataArray);
    tableMap.put(TerminalEnum._const,_constArray);
    tableMap.put(TerminalEnum.eq,eqArray);
    tableMap.put(TerminalEnum.pipe,pipeArray);
    tableMap.put(TerminalEnum.lopt,loptArray);
    tableMap.put(TerminalEnum.rpar,rparArray);
    tableMap.put(TerminalEnum.colon,colonArray);
    tableMap.put(TerminalEnum.bang,bangArray);
    tableMap.put(TerminalEnum.lt,ltArray);
    tableMap.put(TerminalEnum.text,textArray);
    tableMap.put(TerminalEnum.amp,ampArray);
    tableMap.put(TerminalEnum.eol,eolArray);
    tableMap.put(TerminalEnum.print,printArray);
    tableMap.put(TerminalEnum._else,_elseArray);
    tableMap.put(TerminalEnum.le,leArray);
    tableMap.put(TerminalEnum.is,isArray);
    tableMap.put(TerminalEnum.end,endArray);
    tableMap.put(TerminalEnum.id,idArray);
    tableMap.put(TerminalEnum._return,_returnArray);
    tableMap.put(TerminalEnum.number,numberArray);
    tableMap.put(TerminalEnum.damp,dampArray);
    tableMap.put(TerminalEnum._while,_whileArray);
    tableMap.put(TerminalEnum.plus,plusArray);
    tableMap.put(TerminalEnum.slash,slashArray);
    tableMap.put(TerminalEnum.mod,modArray);
    tableMap.put(TerminalEnum._continue,_continueArray);
    tableMap.put(TerminalEnum.bool,boolArray);
    tableMap.put(TerminalEnum.star,starArray);
    tableMap.put(TerminalEnum.integer,integerArray);
    tableMap.put(TerminalEnum.def,defArray);
    tableMap.put(TerminalEnum.dpipe,dpipeArray);
    tableMap.put(TerminalEnum.xor,xorArray);
    tableMap.put(TerminalEnum.ge,geArray);
    tableMap.put(TerminalEnum.or,orArray);
    tableMap.put(TerminalEnum.__eof__,__eof__Array);
    tableMap.put(TerminalEnum.use,useArray);
    tableMap.put(TerminalEnum.ropt,roptArray);
    tableMap.put(TerminalEnum.assign,assignArray);
    tableMap.put(TerminalEnum._if,_ifArray);
    tableMap.put(TerminalEnum._break,_breakArray);
    tableMap.put(TerminalEnum.lpar,lparArray);
    tableMap.put(TerminalEnum.dot,dotArray);
    tableMap.put(TerminalEnum.gt,gtArray);
    tableMap.put(TerminalEnum.minus,minusArray);
    tableMap.put(TerminalEnum.ne,neArray);
    tableMap.put(TerminalEnum.fail,failArray);
    initBranchArrayTable();
    
    StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] tableMetadata = createStateMetadataTable();
    
    EnumMap<NonTerminalEnum,Integer> tableStarts =
      new EnumMap<NonTerminalEnum,Integer>(NonTerminalEnum.class);
    tableStarts.put(NonTerminalEnum.script,0);
    table = new ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>(tableMap,branchArrayTable,tableMetadata,tableStarts,VersionEnum.values(),163,TerminalEnum.__eof__,null);
  } 

  // metadata aren't stored in local vars because it freak-out the register allocator of android
  @SuppressWarnings("unchecked")
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] createStateMetadataTable() {
        metadata0__eof___metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.__eof__,null);
    metadata0expr_optional_5_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_optional_5,null);
    metadata0ropt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ropt,null);
    metadata0comma_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.comma,null);
    metadata0id_metadata0reduceuse_member = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceuse_member);
    metadata0number_metadata0reduceexpr_number = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.number,reduceexpr_number);
    metadata0dot_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.dot,null);
    metadata0instr_metadata0reduceinstr_star_3_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr,reduceinstr_star_3_rec);
    metadata0gt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.gt,null);
    metadata0_if_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._if,null);
    metadata0slash_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.slash,null);
    metadata0_const_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._const,null);
    metadata0_while_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._while,null);
    metadata0star_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.star,null);
    metadata0end_metadata0reduceexpr_if_else = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.end,reduceexpr_if_else);
    metadata0eol_metadata0reduceinstr_continue = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eol,reduceinstr_continue);
    metadata0eol_metadata0reduceinstr_return = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eol,reduceinstr_return);
    metadata0expr_optional_4_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_optional_4,null);
    metadata0colon_metadata0reduceinstr_star_7_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.colon,reduceinstr_star_7_empty);
    metadata0_continue_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._continue,null);
    metadata0rpar_metadata0reduceexpr_method_call = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_method_call);
    metadata0member_star_0_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.member_star_0,null);
    metadata0plus_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.plus,null);
    metadata0rpar_metadata0reduceexpr_fun_call = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_fun_call);
    metadata0text_metadata0reduceexpr_text = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.text,reduceexpr_text);
    metadata0expr_plus_6_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_plus_6,null);
    metadata0print_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.print,null);
    metadata0bang_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.bang,null);
    metadata0_else_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._else,null);
    metadata0instr_star_7_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr_star_7,null);
    metadata0minus_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.minus,null);
    metadata0expr_star_9_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_9_sub,null);
    metadata0_new_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._new,null);
    metadata0or_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.or,null);
    metadata0integer_metadata0reduceexpr_integer = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.integer,reduceexpr_integer);
    metadata0eol_metadata0reduceinstr_expr = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eol,reduceinstr_expr);
    metadata0eq_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eq,null);
    metadata0colon_metadata0reduceinstr_star_3_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.colon,reduceinstr_star_3_empty);
    metadata0null_metadata0reducemember_star_0_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(null,reducemember_star_0_empty);
    metadata0member_metadata0reducemember_star_0_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.member,reducemember_star_0_rec);
    metadata0expr_star_8_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_8,null);
    metadata0end_metadata0reduceexpr_if = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.end,reduceexpr_if);
    metadata0parameter_star_2_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter_star_2,null);
    metadata0parameter_metadata0reduceparameter_star_1_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter,reduceparameter_star_1_rec);
    metadata0parameter_star_1_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter_star_1,null);
    metadata0rpar_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,null);
    metadata0is_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.is,null);
    metadata0bool_metadata0reduceexpr_bool = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.bool,reduceexpr_bool);
    metadata0mod_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.mod,null);
    metadata0rpar_metadata0reduceexpr_new_call = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_new_call);
    metadata0rpar_metadata0reducedata_member = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reducedata_member);
    metadata0instr_star_3_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr_star_3,null);
    metadata0nulz_metadata0reduceexpr_null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.nulz,reduceexpr_null);
    metadata0eol_metadata0reduceinstr_print = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eol,reduceinstr_print);
    metadata0id_metadata0reduceparameter = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceparameter);
    metadata0eol_metadata0reduceinstr_fail = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eol,reduceinstr_fail);
    metadata0id_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,null);
    metadata0expr_star_10_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_10_sub,null);
    metadata0parameter_star_1_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter_star_1_sub,null);
    metadata0expr_star_10_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_10,null);
    metadata0assign_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.assign,null);
    metadata0ge_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ge,null);
    metadata0xor_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.xor,null);
    metadata0data_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.data,null);
    metadata0amp_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.amp,null);
    metadata0lpar_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lpar,null);
    metadata0parameter_metadata0reduceparameter_star_1_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter,reduceparameter_star_1_element);
    metadata0ne_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ne,null);
    metadata0damp_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.damp,null);
    metadata0rpar_metadata0reduceexpr_parens = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_parens);
    metadata0script_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.script,null);
    metadata0expr_star_8_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_8_sub,null);
    metadata0expr_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr,null);
    metadata0parameter_star_2_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter_star_2_sub,null);
    metadata0fail_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.fail,null);
    metadata0_return_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._return,null);
    metadata0end_metadata0reduceexpr_while_else = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.end,reduceexpr_while_else);
    metadata0dpipe_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.dpipe,null);
    metadata0expr_star_9_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_9,null);
    metadata0_break_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._break,null);
    metadata0lopt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lopt,null);
    metadata0lt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lt,null);
    metadata0instr_metadata0reduceinstr_star_7_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr,reduceinstr_star_7_rec);
    metadata0parameter_metadata0reduceparameter_star_2_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter,reduceparameter_star_2_rec);
    metadata0end_metadata0reduceexpr_while = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.end,reduceexpr_while);
    metadata0block_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,null);
    metadata0pipe_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.pipe,null);
    metadata0parameter_metadata0reduceparameter_star_2_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter,reduceparameter_star_2_element);
    metadata0eol_metadata0reduceinstr_break = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eol,reduceinstr_break);
    metadata0le_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.le,null);
    metadata0def_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.def,null);
    metadata0use_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.use,null);
    metadata0id_metadata0reduceexpr_is_instance = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceexpr_is_instance);

    return (StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[])new StateMetadata<?,?,?,?>[]{metadata0null_metadata0reducemember_star_0_empty,metadata0member_star_0_metadata0null,metadata0use_metadata0null,metadata0id_metadata0reduceuse_member,metadata0data_metadata0null,metadata0id_metadata0null,metadata0lpar_metadata0null,metadata0id_metadata0reduceparameter,metadata0parameter_metadata0reduceparameter_star_1_element,metadata0parameter_star_1_metadata0null,metadata0rpar_metadata0reducedata_member,metadata0parameter_star_1_sub_metadata0null,metadata0comma_metadata0null,metadata0parameter_metadata0reduceparameter_star_1_rec,metadata0_const_metadata0null,metadata0id_metadata0null,metadata0assign_metadata0null,metadata0bang_metadata0null,metadata0nulz_metadata0reduceexpr_null,metadata0_new_metadata0null,metadata0id_metadata0null,metadata0lpar_metadata0null,metadata0bool_metadata0reduceexpr_bool,metadata0_if_metadata0null,metadata0text_metadata0reduceexpr_text,metadata0lpar_metadata0null,metadata0is_metadata0null,metadata0integer_metadata0reduceexpr_integer,metadata0minus_metadata0null,metadata0id_metadata0null,metadata0assign_metadata0null,metadata0number_metadata0reduceexpr_number,metadata0_while_metadata0null,metadata0plus_metadata0null,metadata0expr_metadata0null,metadata0star_metadata0null,metadata0expr_metadata0null,metadata0eq_metadata0null,metadata0expr_metadata0null,metadata0pipe_metadata0null,metadata0expr_metadata0null,metadata0dpipe_metadata0null,metadata0expr_metadata0null,metadata0xor_metadata0null,metadata0expr_metadata0null,metadata0ge_metadata0null,metadata0expr_metadata0null,metadata0or_metadata0null,metadata0expr_metadata0null,metadata0lopt_metadata0null,metadata0expr_metadata0null,metadata0lt_metadata0null,metadata0expr_metadata0null,metadata0amp_metadata0null,metadata0expr_metadata0null,metadata0le_metadata0null,metadata0expr_metadata0null,metadata0is_metadata0null,metadata0id_metadata0reduceexpr_is_instance,metadata0dot_metadata0null,metadata0id_metadata0null,metadata0assign_metadata0null,metadata0expr_metadata0null,metadata0gt_metadata0null,metadata0expr_metadata0null,metadata0minus_metadata0null,metadata0expr_metadata0null,metadata0ne_metadata0null,metadata0expr_metadata0null,metadata0damp_metadata0null,metadata0expr_metadata0null,metadata0plus_metadata0null,metadata0expr_metadata0null,metadata0slash_metadata0null,metadata0expr_metadata0null,metadata0mod_metadata0null,metadata0expr_metadata0null,metadata0lpar_metadata0null,metadata0expr_metadata0null,metadata0expr_star_9_metadata0null,metadata0rpar_metadata0reduceexpr_method_call,metadata0expr_star_9_sub_metadata0null,metadata0comma_metadata0null,metadata0expr_metadata0null,metadata0ropt_metadata0null,metadata0assign_metadata0null,metadata0expr_metadata0null,metadata0_if_metadata0null,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0colon_metadata0reduceinstr_star_7_empty,metadata0block_metadata0null,metadata0_else_metadata0null,metadata0colon_metadata0reduceinstr_star_7_empty,metadata0block_metadata0null,metadata0end_metadata0reduceexpr_while_else,metadata0instr_star_7_metadata0null,metadata0print_metadata0null,metadata0expr_metadata0null,metadata0expr_plus_6_metadata0null,metadata0comma_metadata0null,metadata0expr_metadata0null,metadata0eol_metadata0reduceinstr_print,metadata0_break_metadata0null,metadata0expr_metadata0null,metadata0expr_optional_5_metadata0null,metadata0eol_metadata0reduceinstr_break,metadata0_return_metadata0null,metadata0expr_metadata0null,metadata0expr_optional_4_metadata0null,metadata0eol_metadata0reduceinstr_return,metadata0fail_metadata0null,metadata0expr_metadata0null,metadata0eol_metadata0reduceinstr_fail,metadata0_continue_metadata0null,metadata0eol_metadata0reduceinstr_continue,metadata0expr_metadata0null,metadata0eol_metadata0reduceinstr_expr,metadata0instr_metadata0reduceinstr_star_7_rec,metadata0end_metadata0reduceexpr_while,metadata0expr_metadata0null,metadata0lpar_metadata0null,metadata0expr_metadata0null,metadata0expr_star_8_sub_metadata0null,metadata0comma_metadata0null,metadata0expr_metadata0null,metadata0expr_star_8_metadata0null,metadata0rpar_metadata0reduceexpr_fun_call,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0rpar_metadata0reduceexpr_parens,metadata0expr_metadata0null,metadata0colon_metadata0reduceinstr_star_7_empty,metadata0block_metadata0null,metadata0_else_metadata0null,metadata0colon_metadata0reduceinstr_star_7_empty,metadata0block_metadata0null,metadata0end_metadata0reduceexpr_if_else,metadata0end_metadata0reduceexpr_if,metadata0expr_metadata0null,metadata0expr_star_10_sub_metadata0null,metadata0comma_metadata0null,metadata0expr_metadata0null,metadata0expr_star_10_metadata0null,metadata0rpar_metadata0reduceexpr_new_call,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0def_metadata0null,metadata0id_metadata0null,metadata0lpar_metadata0null,metadata0parameter_star_2_sub_metadata0null,metadata0comma_metadata0null,metadata0parameter_metadata0reduceparameter_star_2_rec,metadata0parameter_metadata0reduceparameter_star_2_element,metadata0parameter_star_2_metadata0null,metadata0rpar_metadata0null,metadata0colon_metadata0reduceinstr_star_3_empty,metadata0instr_star_3_metadata0null,metadata0instr_metadata0reduceinstr_star_3_rec,metadata0member_metadata0reducemember_star_0_rec,metadata0script_metadata0null,metadata0__eof___metadata0null};
  }

  
  private int[] exprGotoes;

  private void initexprGotoes() {
    exprGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,147,146,-1,-1,-1,140,-1,132,-1,130,129,-1,128,-1,120,-1,89,34,-1,36,-1,38,-1,40,-1,42,-1,44,-1,46,-1,48,-1,50,-1,52,-1,54,-1,56,-1,-1,-1,-1,-1,62,-1,64,-1,66,-1,68,-1,70,-1,72,-1,74,-1,76,-1,78,-1,-1,-1,-1,83,-1,-1,86,-1,88,-1,-1,-1,-1,-1,-1,-1,-1,116,98,-1,-1,101,-1,-1,104,-1,-1,-1,108,-1,-1,-1,112,-1,-1,-1,-1,-1,-1,-1,-1,-1,122,-1,-1,125,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,143,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,116,-1,-1,-1,-1};
  }
  
  private int[] expr_star_10_subGotoes;

  private void initexpr_star_10_subGotoes() {
    expr_star_10_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,141,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] parameterGotoes;

  private void initparameterGotoes() {
    parameterGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,8,-1,-1,-1,-1,-1,13,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,154,-1,153,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] blockGotoes;

  private void initblockGotoes() {
    blockGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,91,-1,-1,94,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,134,-1,-1,137,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] member_star_0Gotoes;

  private void initmember_star_0Gotoes() {
    member_star_0Gotoes = 
      new int[]{1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_8Gotoes;

  private void initexpr_star_8Gotoes() {
    expr_star_8Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,126,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instr_star_7Gotoes;

  private void initinstr_star_7Gotoes() {
    instr_star_7Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,96,-1,-1,96,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,96,-1,-1,96,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] scriptGotoes;

  private void initscriptGotoes() {
    scriptGotoes = 
      new int[]{161,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] parameter_star_1Gotoes;

  private void initparameter_star_1Gotoes() {
    parameter_star_1Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,9,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_9_subGotoes;

  private void initexpr_star_9_subGotoes() {
    expr_star_9_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,81,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrGotoes;

  private void initinstrGotoes() {
    instrGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,118,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,159,-1,-1,-1,-1};
  }
  
  private int[] parameter_star_2Gotoes;

  private void initparameter_star_2Gotoes() {
    parameter_star_2Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,155,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_plus_6Gotoes;

  private void initexpr_plus_6Gotoes() {
    expr_plus_6Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,99,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] parameter_star_2_subGotoes;

  private void initparameter_star_2_subGotoes() {
    parameter_star_2_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,151,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_optional_4Gotoes;

  private void initexpr_optional_4Gotoes() {
    expr_optional_4Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,109,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instr_star_3Gotoes;

  private void initinstr_star_3Gotoes() {
    instr_star_3Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,158,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_9Gotoes;

  private void initexpr_star_9Gotoes() {
    expr_star_9Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,79,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_10Gotoes;

  private void initexpr_star_10Gotoes() {
    expr_star_10Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,144,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_8_subGotoes;

  private void initexpr_star_8_subGotoes() {
    expr_star_8_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,123,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] memberGotoes;

  private void initmemberGotoes() {
    memberGotoes = 
      new int[]{-1,160,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_optional_5Gotoes;

  private void initexpr_optional_5Gotoes() {
    expr_optional_5Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,105,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] parameter_star_1_subGotoes;

  private void initparameter_star_1_subGotoes() {
    parameter_star_1_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,11,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] nulzArray;
  @SuppressWarnings("unchecked")
  private void initnulzArray() {
    nulzArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift18,shift18,branch0,branch0,branch0,shift18,branch0,shift18,branch0,shift18,shift18,branch0,shift18,branch0,shift18,branch0,shift18,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,branch0,branch0,branch0,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,branch0,branch0,branch0,shift18,branch0,branch0,shift18,branch0,shift18,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,shift18,shift18,branch0,branch0,shift18,branch0,reduceinstr_print,shift18,branch0,branch0,reduceinstr_break,shift18,branch0,branch0,reduceinstr_return,shift18,branch0,reduceinstr_fail,branch0,reduceinstr_continue,branch0,reduceinstr_expr,reduceinstr_star_7_rec,branch0,branch0,shift18,branch0,branch0,shift18,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,branch0,branch0,branch0,shift18,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift18,reduceinstr_star_3_rec,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _newArray;
  @SuppressWarnings("unchecked")
  private void init_newArray() {
    _newArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift19,shift19,branch0,branch0,branch0,shift19,branch0,shift19,branch0,shift19,shift19,branch0,shift19,branch0,shift19,branch0,shift19,shift19,branch0,shift19,branch0,shift19,branch0,shift19,branch0,shift19,branch0,shift19,branch0,shift19,branch0,shift19,branch0,shift19,branch0,shift19,branch0,shift19,branch0,shift19,branch0,branch0,branch0,branch0,branch0,shift19,branch0,shift19,branch0,shift19,branch0,shift19,branch0,shift19,branch0,shift19,branch0,shift19,branch0,shift19,branch0,shift19,branch0,branch0,branch0,branch0,shift19,branch0,branch0,shift19,branch0,shift19,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,shift19,shift19,branch0,branch0,shift19,branch0,reduceinstr_print,shift19,branch0,branch0,reduceinstr_break,shift19,branch0,branch0,reduceinstr_return,shift19,branch0,reduceinstr_fail,branch0,reduceinstr_continue,branch0,reduceinstr_expr,reduceinstr_star_7_rec,branch0,branch0,shift19,branch0,branch0,shift19,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,branch0,branch0,branch0,shift19,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift19,reduceinstr_star_3_rec,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] commaArray;
  @SuppressWarnings("unchecked")
  private void initcommaArray() {
    commaArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceparameter,reduceparameter_star_1_element,branch0,branch0,shift12,branch0,reduceparameter_star_1_rec,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_bor,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_ge,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_le,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,reduceexpr_attribute_assignment,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_band,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,reduceexpr_star_9_element,branch0,reduceexpr_method_call,shift82,branch0,reduceexpr_star_9_rec,reduceexpr_array_access,branch0,reduceexpr_array_assignment,branch0,reduceexpr_orif,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,reduceexpr_plus_6_element,shift100,branch0,reduceexpr_plus_6_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_while,reduceexpr_var_assignment,branch0,reduceexpr_star_8_element,shift124,branch0,reduceexpr_star_8_rec,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,reduceexpr_star_10_element,shift142,branch0,reduceexpr_star_10_rec,branch0,reduceexpr_new_call,reduceexpr_unary_not,branch0,branch0,branch0,branch0,shift152,branch0,reduceparameter_star_2_rec,reduceparameter_star_2_element,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] dataArray;
  @SuppressWarnings("unchecked")
  private void initdataArray() {
    dataArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reducemember_star_0_empty,shift4,branch0,reduceuse_member,branch0,branch0,branch0,branch0,branch0,branch0,reducedata_member,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_bor,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_ge,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_le,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,reduceexpr_attribute_assignment,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_band,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,reduceexpr_method_call,branch0,branch0,branch0,reduceexpr_array_access,branch0,reduceexpr_array_assignment,branch0,reduceexpr_orif,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,branch0,reduceinstr_return,branch0,branch0,reduceinstr_fail,branch0,reduceinstr_continue,branch0,reduceinstr_expr,branch0,reduceexpr_while,reduceexpr_var_assignment,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,branch0,branch0,branch0,branch0,branch0,reduceexpr_new_call,reduceexpr_unary_not,reduceconst_member,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,reducefun_member,reduceinstr_star_3_rec,reducemember_star_0_rec,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _constArray;
  @SuppressWarnings("unchecked")
  private void init_constArray() {
    _constArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reducemember_star_0_empty,shift14,branch0,reduceuse_member,branch0,branch0,branch0,branch0,branch0,branch0,reducedata_member,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_bor,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_ge,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_le,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,reduceexpr_attribute_assignment,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_band,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,reduceexpr_method_call,branch0,branch0,branch0,reduceexpr_array_access,branch0,reduceexpr_array_assignment,branch0,reduceexpr_orif,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,branch0,reduceinstr_return,branch0,branch0,reduceinstr_fail,branch0,reduceinstr_continue,branch0,reduceinstr_expr,branch0,reduceexpr_while,reduceexpr_var_assignment,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,branch0,branch0,branch0,branch0,branch0,reduceexpr_new_call,reduceexpr_unary_not,reduceconst_member,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,reducefun_member,reduceinstr_star_3_rec,reducemember_star_0_rec,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] eqArray;
  @SuppressWarnings("unchecked")
  private void initeqArray() {
    eqArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_or,branch0,shift37,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_ge,branch0,shift37,branch0,shift37,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_le,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,shift37,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_ne,branch0,shift37,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,shift37,branch0,reduceexpr_method_call,branch0,branch0,shift37,reduceexpr_array_access,branch0,shift37,branch0,shift37,shift37,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,shift37,branch0,branch0,shift37,branch0,branch0,shift37,branch0,branch0,branch0,shift37,branch0,branch0,branch0,shift37,branch0,branch0,branch0,shift37,branch0,branch0,reduceexpr_while,shift37,branch0,shift37,branch0,branch0,shift37,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,shift37,reduceexpr_parens,shift37,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift37,branch0,branch0,shift37,branch0,reduceexpr_new_call,reduceexpr_unary_not,shift37,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] pipeArray;
  @SuppressWarnings("unchecked")
  private void initpipeArray() {
    pipeArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,shift39,branch0,reduceexpr_binary_or,branch0,shift39,branch0,reduceexpr_binary_xor,branch0,shift39,branch0,shift39,branch0,shift39,branch0,shift39,branch0,reduceexpr_binary_and,branch0,shift39,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,shift39,branch0,shift39,branch0,reduceexpr_binary_sub,branch0,shift39,branch0,shift39,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,shift39,branch0,reduceexpr_method_call,branch0,branch0,shift39,reduceexpr_array_access,branch0,shift39,branch0,shift39,shift39,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,shift39,branch0,branch0,shift39,branch0,branch0,shift39,branch0,branch0,branch0,shift39,branch0,branch0,branch0,shift39,branch0,branch0,branch0,shift39,branch0,branch0,reduceexpr_while,shift39,branch0,shift39,branch0,branch0,shift39,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,shift39,reduceexpr_parens,shift39,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift39,branch0,branch0,shift39,branch0,reduceexpr_new_call,reduceexpr_unary_not,shift39,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] loptArray;
  @SuppressWarnings("unchecked")
  private void initloptArray() {
    loptArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,reduceexpr_method_call,branch0,branch0,shift49,reduceexpr_array_access,branch0,shift49,branch0,shift49,shift49,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,shift49,branch0,branch0,shift49,branch0,branch0,shift49,branch0,branch0,branch0,shift49,branch0,branch0,branch0,shift49,branch0,branch0,branch0,shift49,branch0,branch0,reduceexpr_while,shift49,branch0,shift49,branch0,branch0,shift49,branch0,reduceexpr_fun_call,shift49,shift49,shift49,reduceexpr_parens,shift49,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift49,branch0,branch0,shift49,branch0,reduceexpr_new_call,shift49,shift49,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] rparArray;
  @SuppressWarnings("unchecked")
  private void initrparArray() {
    rparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceparameter_star_1_empty,reduceparameter,reduceparameter_star_1_element,shift10,branch0,reduceparameter_star_1_through,branch0,reduceparameter_star_1_rec,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,reduceexpr_star_10_empty,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_bor,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_ge,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_le,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,reduceexpr_attribute_assignment,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_band,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,reduceexpr_star_9_empty,reduceexpr_star_9_element,shift80,reduceexpr_method_call,reduceexpr_star_9_through,branch0,reduceexpr_star_9_rec,reduceexpr_array_access,branch0,reduceexpr_array_assignment,branch0,reduceexpr_orif,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_while,reduceexpr_var_assignment,reduceexpr_star_8_empty,reduceexpr_star_8_element,reduceexpr_star_8_through,branch0,reduceexpr_star_8_rec,shift127,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,shift131,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,reduceexpr_star_10_element,reduceexpr_star_10_through,branch0,reduceexpr_star_10_rec,shift145,reduceexpr_new_call,reduceexpr_unary_not,branch0,branch0,branch0,reduceparameter_star_2_empty,reduceparameter_star_2_through,branch0,reduceparameter_star_2_rec,reduceparameter_star_2_element,shift156,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] colonArray;
  @SuppressWarnings("unchecked")
  private void initcolonArray() {
    colonArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_bor,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_ge,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_le,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,reduceexpr_attribute_assignment,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_band,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,reduceexpr_method_call,branch0,branch0,branch0,reduceexpr_array_access,branch0,reduceexpr_array_assignment,branch0,reduceexpr_orif,shift90,branch0,branch0,shift93,branch0,branch0,reduceexpr_while_else,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_while,reduceexpr_var_assignment,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,branch0,reduceexpr_parens,shift133,branch0,branch0,shift136,branch0,branch0,reduceexpr_if_else,reduceexpr_if,branch0,branch0,branch0,branch0,branch0,reduceexpr_new_call,reduceexpr_unary_not,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift157,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] bangArray;
  @SuppressWarnings("unchecked")
  private void initbangArray() {
    bangArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift17,shift17,branch0,branch0,branch0,shift17,branch0,shift17,branch0,shift17,shift17,branch0,shift17,branch0,shift17,branch0,shift17,shift17,branch0,shift17,branch0,shift17,branch0,shift17,branch0,shift17,branch0,shift17,branch0,shift17,branch0,shift17,branch0,shift17,branch0,shift17,branch0,shift17,branch0,shift17,branch0,branch0,branch0,branch0,branch0,shift17,branch0,shift17,branch0,shift17,branch0,shift17,branch0,shift17,branch0,shift17,branch0,shift17,branch0,shift17,branch0,shift17,branch0,branch0,branch0,branch0,shift17,branch0,branch0,shift17,branch0,shift17,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,shift17,shift17,branch0,branch0,shift17,branch0,reduceinstr_print,shift17,branch0,branch0,reduceinstr_break,shift17,branch0,branch0,reduceinstr_return,shift17,branch0,reduceinstr_fail,branch0,reduceinstr_continue,branch0,reduceinstr_expr,reduceinstr_star_7_rec,branch0,branch0,shift17,branch0,branch0,shift17,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,branch0,branch0,branch0,shift17,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift17,reduceinstr_star_3_rec,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] ltArray;
  @SuppressWarnings("unchecked")
  private void initltArray() {
    ltArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_or,branch0,shift51,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_ge,branch0,shift51,branch0,shift51,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_le,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,shift51,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_ne,branch0,shift51,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,shift51,branch0,reduceexpr_method_call,branch0,branch0,shift51,reduceexpr_array_access,branch0,shift51,branch0,shift51,shift51,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,shift51,branch0,branch0,shift51,branch0,branch0,shift51,branch0,branch0,branch0,shift51,branch0,branch0,branch0,shift51,branch0,branch0,branch0,shift51,branch0,branch0,reduceexpr_while,shift51,branch0,shift51,branch0,branch0,shift51,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,shift51,reduceexpr_parens,shift51,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift51,branch0,branch0,shift51,branch0,reduceexpr_new_call,reduceexpr_unary_not,shift51,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] textArray;
  @SuppressWarnings("unchecked")
  private void inittextArray() {
    textArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift24,shift24,branch0,branch0,branch0,shift24,branch0,shift24,branch0,shift24,shift24,branch0,shift24,branch0,shift24,branch0,shift24,shift24,branch0,shift24,branch0,shift24,branch0,shift24,branch0,shift24,branch0,shift24,branch0,shift24,branch0,shift24,branch0,shift24,branch0,shift24,branch0,shift24,branch0,shift24,branch0,branch0,branch0,branch0,branch0,shift24,branch0,shift24,branch0,shift24,branch0,shift24,branch0,shift24,branch0,shift24,branch0,shift24,branch0,shift24,branch0,shift24,branch0,branch0,branch0,branch0,shift24,branch0,branch0,shift24,branch0,shift24,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,shift24,shift24,branch0,branch0,shift24,branch0,reduceinstr_print,shift24,branch0,branch0,reduceinstr_break,shift24,branch0,branch0,reduceinstr_return,shift24,branch0,reduceinstr_fail,branch0,reduceinstr_continue,branch0,reduceinstr_expr,reduceinstr_star_7_rec,branch0,branch0,shift24,branch0,branch0,shift24,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,branch0,branch0,branch0,shift24,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift24,reduceinstr_star_3_rec,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] ampArray;
  @SuppressWarnings("unchecked")
  private void initampArray() {
    ampArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,shift53,branch0,reduceexpr_binary_or,branch0,shift53,branch0,reduceexpr_binary_xor,branch0,shift53,branch0,shift53,branch0,shift53,branch0,shift53,branch0,reduceexpr_binary_and,branch0,shift53,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,shift53,branch0,shift53,branch0,reduceexpr_binary_sub,branch0,shift53,branch0,shift53,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,shift53,branch0,reduceexpr_method_call,branch0,branch0,shift53,reduceexpr_array_access,branch0,shift53,branch0,shift53,shift53,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,shift53,branch0,branch0,shift53,branch0,branch0,shift53,branch0,branch0,branch0,shift53,branch0,branch0,branch0,shift53,branch0,branch0,branch0,shift53,branch0,branch0,reduceexpr_while,shift53,branch0,shift53,branch0,branch0,shift53,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,shift53,reduceexpr_parens,shift53,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift53,branch0,branch0,shift53,branch0,reduceexpr_new_call,reduceexpr_unary_not,shift53,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] eolArray;
  @SuppressWarnings("unchecked")
  private void initeolArray() {
    eolArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_bor,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_ge,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_le,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,reduceexpr_attribute_assignment,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_band,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,reduceexpr_method_call,branch0,branch0,branch0,reduceexpr_array_access,branch0,reduceexpr_array_assignment,branch0,reduceexpr_orif,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,reduceexpr_plus_6_element,shift102,branch0,reduceexpr_plus_6_rec,branch0,reduceexpr_optional_5_empty,reduceexpr_optional_5_expr,shift106,branch0,reduceexpr_optional_4_empty,reduceexpr_optional_4_expr,shift110,branch0,branch0,shift113,branch0,shift115,branch0,shift117,branch0,branch0,reduceexpr_while,reduceexpr_var_assignment,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,branch0,branch0,branch0,branch0,branch0,reduceexpr_new_call,reduceexpr_unary_not,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] printArray;
  @SuppressWarnings("unchecked")
  private void initprintArray() {
    printArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,shift97,branch0,branch0,branch0,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,branch0,reduceinstr_return,branch0,branch0,reduceinstr_fail,branch0,reduceinstr_continue,branch0,reduceinstr_expr,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift97,reduceinstr_star_3_rec,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _elseArray;
  @SuppressWarnings("unchecked")
  private void init_elseArray() {
    _elseArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,shift92,branch0,branch0,branch0,branch0,reduceblock,branch0,branch0,branch0,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,branch0,reduceinstr_return,branch0,branch0,reduceinstr_fail,branch0,reduceinstr_continue,branch0,reduceinstr_expr,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,shift135,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] leArray;
  @SuppressWarnings("unchecked")
  private void initleArray() {
    leArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_or,branch0,shift55,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_ge,branch0,shift55,branch0,shift55,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_le,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,shift55,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_ne,branch0,shift55,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,shift55,branch0,reduceexpr_method_call,branch0,branch0,shift55,reduceexpr_array_access,branch0,shift55,branch0,shift55,shift55,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,shift55,branch0,branch0,shift55,branch0,branch0,shift55,branch0,branch0,branch0,shift55,branch0,branch0,branch0,shift55,branch0,branch0,branch0,shift55,branch0,branch0,reduceexpr_while,shift55,branch0,shift55,branch0,branch0,shift55,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,shift55,reduceexpr_parens,shift55,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift55,branch0,branch0,shift55,branch0,reduceexpr_new_call,reduceexpr_unary_not,shift55,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] isArray;
  @SuppressWarnings("unchecked")
  private void initisArray() {
    isArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift26,shift26,reduceexpr_null,branch0,branch0,shift26,reduceexpr_bool,shift26,reduceexpr_text,shift26,shift26,reduceexpr_integer,shift26,reduceexpr_var_access,shift26,reduceexpr_number,shift26,shift26,reduceexpr_unary_plus,shift26,reduceexpr_binary_mul,shift26,reduceexpr_binary_eq,shift26,reduceexpr_binary_or,shift26,reduceexpr_binary_bor,shift26,reduceexpr_binary_xor,shift26,reduceexpr_binary_ge,shift26,shift57,shift26,shift57,shift26,reduceexpr_binary_lt,shift26,reduceexpr_binary_and,shift26,reduceexpr_binary_le,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,shift26,shift57,shift26,reduceexpr_binary_gt,shift26,reduceexpr_binary_sub,shift26,reduceexpr_binary_ne,shift26,reduceexpr_binary_band,shift26,reduceexpr_binary_add,shift26,reduceexpr_binary_div,shift26,reduceexpr_binary_mod,shift26,shift57,branch0,reduceexpr_method_call,branch0,shift26,shift57,reduceexpr_array_access,shift26,shift57,shift26,shift57,shift57,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,reduceexpr_while_else,shift26,shift26,shift57,branch0,shift26,shift57,reduceinstr_print,shift26,shift57,branch0,reduceinstr_break,shift26,shift57,branch0,reduceinstr_return,shift26,shift57,reduceinstr_fail,branch0,reduceinstr_continue,shift57,reduceinstr_expr,reduceinstr_star_7_rec,reduceexpr_while,shift57,shift26,shift57,branch0,shift26,shift57,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,shift57,reduceexpr_parens,shift57,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,reduceexpr_if_else,reduceexpr_if,shift57,branch0,shift26,shift57,branch0,reduceexpr_new_call,reduceexpr_unary_not,shift57,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift26,reduceinstr_star_3_rec,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] endArray;
  @SuppressWarnings("unchecked")
  private void initendArray() {
    endArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,shift119,branch0,reduceinstr_star_7_empty,shift95,branch0,reduceblock,branch0,branch0,branch0,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,branch0,reduceinstr_return,branch0,branch0,reduceinstr_fail,branch0,reduceinstr_continue,branch0,reduceinstr_expr,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,shift139,branch0,reduceinstr_star_7_empty,shift138,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] idArray;
  @SuppressWarnings("unchecked")
  private void initidArray() {
    idArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,shift3,branch0,shift5,branch0,shift7,branch0,branch0,branch0,branch0,branch0,shift7,branch0,shift15,branch0,shift29,shift29,branch0,shift20,branch0,shift29,branch0,shift29,branch0,shift29,shift29,branch0,shift29,branch0,shift29,branch0,shift29,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift58,branch0,shift60,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,branch0,branch0,branch0,shift29,branch0,branch0,shift29,branch0,shift29,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,shift29,shift29,branch0,branch0,shift29,branch0,reduceinstr_print,shift29,branch0,branch0,reduceinstr_break,shift29,branch0,branch0,reduceinstr_return,shift29,branch0,reduceinstr_fail,branch0,reduceinstr_continue,branch0,reduceinstr_expr,reduceinstr_star_7_rec,branch0,branch0,shift29,branch0,branch0,shift29,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,branch0,branch0,branch0,shift29,branch0,branch0,branch0,branch0,branch0,shift149,branch0,shift7,branch0,shift7,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift29,reduceinstr_star_3_rec,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _returnArray;
  @SuppressWarnings("unchecked")
  private void init_returnArray() {
    _returnArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,shift107,branch0,branch0,branch0,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,branch0,reduceinstr_return,branch0,branch0,reduceinstr_fail,branch0,reduceinstr_continue,branch0,reduceinstr_expr,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift107,reduceinstr_star_3_rec,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] numberArray;
  @SuppressWarnings("unchecked")
  private void initnumberArray() {
    numberArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift31,shift31,branch0,branch0,branch0,shift31,branch0,shift31,branch0,shift31,shift31,branch0,shift31,branch0,shift31,branch0,shift31,shift31,branch0,shift31,branch0,shift31,branch0,shift31,branch0,shift31,branch0,shift31,branch0,shift31,branch0,shift31,branch0,shift31,branch0,shift31,branch0,shift31,branch0,shift31,branch0,branch0,branch0,branch0,branch0,shift31,branch0,shift31,branch0,shift31,branch0,shift31,branch0,shift31,branch0,shift31,branch0,shift31,branch0,shift31,branch0,shift31,branch0,branch0,branch0,branch0,shift31,branch0,branch0,shift31,branch0,shift31,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,shift31,shift31,branch0,branch0,shift31,branch0,reduceinstr_print,shift31,branch0,branch0,reduceinstr_break,shift31,branch0,branch0,reduceinstr_return,shift31,branch0,reduceinstr_fail,branch0,reduceinstr_continue,branch0,reduceinstr_expr,reduceinstr_star_7_rec,branch0,branch0,shift31,branch0,branch0,shift31,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,branch0,branch0,branch0,shift31,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift31,reduceinstr_star_3_rec,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] dampArray;
  @SuppressWarnings("unchecked")
  private void initdampArray() {
    dampArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_bor,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_ge,branch0,shift69,branch0,shift69,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_le,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,shift69,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_band,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,shift69,branch0,reduceexpr_method_call,branch0,branch0,shift69,reduceexpr_array_access,branch0,shift69,branch0,shift69,shift69,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,shift69,branch0,branch0,shift69,branch0,branch0,shift69,branch0,branch0,branch0,shift69,branch0,branch0,branch0,shift69,branch0,branch0,branch0,shift69,branch0,branch0,reduceexpr_while,shift69,branch0,shift69,branch0,branch0,shift69,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,shift69,reduceexpr_parens,shift69,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift69,branch0,branch0,shift69,branch0,reduceexpr_new_call,reduceexpr_unary_not,shift69,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _whileArray;
  @SuppressWarnings("unchecked")
  private void init_whileArray() {
    _whileArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift32,shift32,branch0,branch0,branch0,shift32,branch0,shift32,branch0,shift32,shift32,branch0,shift32,branch0,shift32,branch0,shift32,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,branch0,branch0,branch0,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,branch0,branch0,branch0,shift32,branch0,branch0,shift32,branch0,shift32,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,shift32,shift32,branch0,branch0,shift32,branch0,reduceinstr_print,shift32,branch0,branch0,reduceinstr_break,shift32,branch0,branch0,reduceinstr_return,shift32,branch0,reduceinstr_fail,branch0,reduceinstr_continue,branch0,reduceinstr_expr,reduceinstr_star_7_rec,branch0,branch0,shift32,branch0,branch0,shift32,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,branch0,branch0,branch0,shift32,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift32,reduceinstr_star_3_rec,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] plusArray;
  @SuppressWarnings("unchecked")
  private void initplusArray() {
    plusArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift33,shift33,reduceexpr_null,branch0,branch0,shift33,reduceexpr_bool,shift33,reduceexpr_text,shift33,shift33,reduceexpr_integer,shift33,reduceexpr_var_access,shift33,reduceexpr_number,shift33,shift33,reduceexpr_unary_plus,shift33,reduceexpr_binary_mul,shift33,shift71,shift33,reduceexpr_binary_or,shift33,shift71,shift33,reduceexpr_binary_xor,shift33,shift71,shift33,shift71,shift33,shift71,shift33,shift71,shift33,reduceexpr_binary_and,shift33,shift71,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,shift33,shift71,shift33,shift71,shift33,reduceexpr_binary_sub,shift33,shift71,shift33,shift71,shift33,reduceexpr_binary_add,shift33,reduceexpr_binary_div,shift33,reduceexpr_binary_mod,shift33,shift71,branch0,reduceexpr_method_call,branch0,shift33,shift71,reduceexpr_array_access,shift33,shift71,shift33,shift71,shift71,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,reduceexpr_while_else,shift33,shift33,shift71,branch0,shift33,shift71,reduceinstr_print,shift33,shift71,branch0,reduceinstr_break,shift33,shift71,branch0,reduceinstr_return,shift33,shift71,reduceinstr_fail,branch0,reduceinstr_continue,shift71,reduceinstr_expr,reduceinstr_star_7_rec,reduceexpr_while,shift71,shift33,shift71,branch0,shift33,shift71,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,shift71,reduceexpr_parens,shift71,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,reduceexpr_if_else,reduceexpr_if,shift71,branch0,shift33,shift71,branch0,reduceexpr_new_call,reduceexpr_unary_not,shift71,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift33,reduceinstr_star_3_rec,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] slashArray;
  @SuppressWarnings("unchecked")
  private void initslashArray() {
    slashArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,shift73,branch0,shift73,branch0,shift73,branch0,shift73,branch0,shift73,branch0,shift73,branch0,shift73,branch0,shift73,branch0,shift73,branch0,shift73,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,shift73,branch0,shift73,branch0,shift73,branch0,shift73,branch0,shift73,branch0,shift73,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,shift73,branch0,reduceexpr_method_call,branch0,branch0,shift73,reduceexpr_array_access,branch0,shift73,branch0,shift73,shift73,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,shift73,branch0,branch0,shift73,branch0,branch0,shift73,branch0,branch0,branch0,shift73,branch0,branch0,branch0,shift73,branch0,branch0,branch0,shift73,branch0,branch0,reduceexpr_while,shift73,branch0,shift73,branch0,branch0,shift73,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,shift73,reduceexpr_parens,shift73,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift73,branch0,branch0,shift73,branch0,reduceexpr_new_call,reduceexpr_unary_not,shift73,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] modArray;
  @SuppressWarnings("unchecked")
  private void initmodArray() {
    modArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,shift75,branch0,shift75,branch0,shift75,branch0,shift75,branch0,shift75,branch0,shift75,branch0,shift75,branch0,shift75,branch0,shift75,branch0,shift75,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,shift75,branch0,shift75,branch0,shift75,branch0,shift75,branch0,shift75,branch0,shift75,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,shift75,branch0,reduceexpr_method_call,branch0,branch0,shift75,reduceexpr_array_access,branch0,shift75,branch0,shift75,shift75,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,shift75,branch0,branch0,shift75,branch0,branch0,shift75,branch0,branch0,branch0,shift75,branch0,branch0,branch0,shift75,branch0,branch0,branch0,shift75,branch0,branch0,reduceexpr_while,shift75,branch0,shift75,branch0,branch0,shift75,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,shift75,reduceexpr_parens,shift75,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift75,branch0,branch0,shift75,branch0,reduceexpr_new_call,reduceexpr_unary_not,shift75,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _continueArray;
  @SuppressWarnings("unchecked")
  private void init_continueArray() {
    _continueArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,shift114,branch0,branch0,branch0,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,branch0,reduceinstr_return,branch0,branch0,reduceinstr_fail,branch0,reduceinstr_continue,branch0,reduceinstr_expr,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift114,reduceinstr_star_3_rec,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] boolArray;
  @SuppressWarnings("unchecked")
  private void initboolArray() {
    boolArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift22,shift22,branch0,branch0,branch0,shift22,branch0,shift22,branch0,shift22,shift22,branch0,shift22,branch0,shift22,branch0,shift22,shift22,branch0,shift22,branch0,shift22,branch0,shift22,branch0,shift22,branch0,shift22,branch0,shift22,branch0,shift22,branch0,shift22,branch0,shift22,branch0,shift22,branch0,shift22,branch0,branch0,branch0,branch0,branch0,shift22,branch0,shift22,branch0,shift22,branch0,shift22,branch0,shift22,branch0,shift22,branch0,shift22,branch0,shift22,branch0,shift22,branch0,branch0,branch0,branch0,shift22,branch0,branch0,shift22,branch0,shift22,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,shift22,shift22,branch0,branch0,shift22,branch0,reduceinstr_print,shift22,branch0,branch0,reduceinstr_break,shift22,branch0,branch0,reduceinstr_return,shift22,branch0,reduceinstr_fail,branch0,reduceinstr_continue,branch0,reduceinstr_expr,reduceinstr_star_7_rec,branch0,branch0,shift22,branch0,branch0,shift22,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,branch0,branch0,branch0,shift22,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift22,reduceinstr_star_3_rec,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] starArray;
  @SuppressWarnings("unchecked")
  private void initstarArray() {
    starArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,shift35,branch0,reduceexpr_method_call,branch0,branch0,shift35,reduceexpr_array_access,branch0,shift35,branch0,shift35,shift35,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,shift35,branch0,branch0,shift35,branch0,branch0,shift35,branch0,branch0,branch0,shift35,branch0,branch0,branch0,shift35,branch0,branch0,branch0,shift35,branch0,branch0,reduceexpr_while,shift35,branch0,shift35,branch0,branch0,shift35,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,shift35,reduceexpr_parens,shift35,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift35,branch0,branch0,shift35,branch0,reduceexpr_new_call,reduceexpr_unary_not,shift35,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] integerArray;
  @SuppressWarnings("unchecked")
  private void initintegerArray() {
    integerArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift27,shift27,branch0,branch0,branch0,shift27,branch0,shift27,branch0,shift27,shift27,branch0,shift27,branch0,shift27,branch0,shift27,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,branch0,branch0,branch0,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,branch0,branch0,branch0,shift27,branch0,branch0,shift27,branch0,shift27,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,shift27,shift27,branch0,branch0,shift27,branch0,reduceinstr_print,shift27,branch0,branch0,reduceinstr_break,shift27,branch0,branch0,reduceinstr_return,shift27,branch0,reduceinstr_fail,branch0,reduceinstr_continue,branch0,reduceinstr_expr,reduceinstr_star_7_rec,branch0,branch0,shift27,branch0,branch0,shift27,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,branch0,branch0,branch0,shift27,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift27,reduceinstr_star_3_rec,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] defArray;
  @SuppressWarnings("unchecked")
  private void initdefArray() {
    defArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reducemember_star_0_empty,shift148,branch0,reduceuse_member,branch0,branch0,branch0,branch0,branch0,branch0,reducedata_member,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_bor,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_ge,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_le,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,reduceexpr_attribute_assignment,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_band,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,reduceexpr_method_call,branch0,branch0,branch0,reduceexpr_array_access,branch0,reduceexpr_array_assignment,branch0,reduceexpr_orif,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,branch0,reduceinstr_return,branch0,branch0,reduceinstr_fail,branch0,reduceinstr_continue,branch0,reduceinstr_expr,branch0,reduceexpr_while,reduceexpr_var_assignment,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,branch0,branch0,branch0,branch0,branch0,reduceexpr_new_call,reduceexpr_unary_not,reduceconst_member,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,reducefun_member,reduceinstr_star_3_rec,reducemember_star_0_rec,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] dpipeArray;
  @SuppressWarnings("unchecked")
  private void initdpipeArray() {
    dpipeArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_bor,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_ge,branch0,shift41,branch0,shift41,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_le,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,shift41,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_band,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,shift41,branch0,reduceexpr_method_call,branch0,branch0,shift41,reduceexpr_array_access,branch0,shift41,branch0,shift41,shift41,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,shift41,branch0,branch0,shift41,branch0,branch0,shift41,branch0,branch0,branch0,shift41,branch0,branch0,branch0,shift41,branch0,branch0,branch0,shift41,branch0,branch0,reduceexpr_while,shift41,branch0,shift41,branch0,branch0,shift41,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,shift41,reduceexpr_parens,shift41,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift41,branch0,branch0,shift41,branch0,reduceexpr_new_call,reduceexpr_unary_not,shift41,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] xorArray;
  @SuppressWarnings("unchecked")
  private void initxorArray() {
    xorArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,shift43,branch0,reduceexpr_binary_or,branch0,shift43,branch0,reduceexpr_binary_xor,branch0,shift43,branch0,shift43,branch0,shift43,branch0,shift43,branch0,reduceexpr_binary_and,branch0,shift43,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,shift43,branch0,shift43,branch0,reduceexpr_binary_sub,branch0,shift43,branch0,shift43,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,shift43,branch0,reduceexpr_method_call,branch0,branch0,shift43,reduceexpr_array_access,branch0,shift43,branch0,shift43,shift43,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,shift43,branch0,branch0,shift43,branch0,branch0,shift43,branch0,branch0,branch0,shift43,branch0,branch0,branch0,shift43,branch0,branch0,branch0,shift43,branch0,branch0,reduceexpr_while,shift43,branch0,shift43,branch0,branch0,shift43,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,shift43,reduceexpr_parens,shift43,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift43,branch0,branch0,shift43,branch0,reduceexpr_new_call,reduceexpr_unary_not,shift43,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] geArray;
  @SuppressWarnings("unchecked")
  private void initgeArray() {
    geArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_or,branch0,shift45,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_ge,branch0,shift45,branch0,shift45,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_le,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,shift45,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_ne,branch0,shift45,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,shift45,branch0,reduceexpr_method_call,branch0,branch0,shift45,reduceexpr_array_access,branch0,shift45,branch0,shift45,shift45,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,shift45,branch0,branch0,shift45,branch0,branch0,shift45,branch0,branch0,branch0,shift45,branch0,branch0,branch0,shift45,branch0,branch0,branch0,shift45,branch0,branch0,reduceexpr_while,shift45,branch0,shift45,branch0,branch0,shift45,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,shift45,reduceexpr_parens,shift45,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift45,branch0,branch0,shift45,branch0,reduceexpr_new_call,reduceexpr_unary_not,shift45,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] orArray;
  @SuppressWarnings("unchecked")
  private void initorArray() {
    orArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_bor,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_ge,branch0,shift47,branch0,shift47,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_le,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,shift47,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_band,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,shift47,branch0,reduceexpr_method_call,branch0,branch0,shift47,reduceexpr_array_access,branch0,shift47,branch0,shift47,shift47,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,shift47,branch0,branch0,shift47,branch0,branch0,shift47,branch0,branch0,branch0,shift47,branch0,branch0,branch0,shift47,branch0,branch0,branch0,shift47,branch0,branch0,reduceexpr_while,shift47,branch0,shift47,branch0,branch0,shift47,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,shift47,reduceexpr_parens,shift47,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift47,branch0,branch0,shift47,branch0,reduceexpr_new_call,reduceexpr_unary_not,shift47,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] __eof__Array;
  @SuppressWarnings("unchecked")
  private void init__eof__Array() {
    __eof__Array=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reducemember_star_0_empty,reducescript,branch0,reduceuse_member,branch0,branch0,branch0,branch0,branch0,branch0,reducedata_member,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_bor,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_ge,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_le,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,reduceexpr_attribute_assignment,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_band,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,reduceexpr_method_call,branch0,branch0,branch0,reduceexpr_array_access,branch0,reduceexpr_array_assignment,branch0,reduceexpr_orif,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,branch0,reduceinstr_return,branch0,branch0,reduceinstr_fail,branch0,reduceinstr_continue,branch0,reduceinstr_expr,branch0,reduceexpr_while,reduceexpr_var_assignment,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,branch0,branch0,branch0,branch0,branch0,reduceexpr_new_call,reduceexpr_unary_not,reduceconst_member,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,reducefun_member,reduceinstr_star_3_rec,reducemember_star_0_rec,accept,accept};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] useArray;
  @SuppressWarnings("unchecked")
  private void inituseArray() {
    useArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reducemember_star_0_empty,shift2,branch0,reduceuse_member,branch0,branch0,branch0,branch0,branch0,branch0,reducedata_member,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_bor,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_ge,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_le,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,reduceexpr_attribute_assignment,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_band,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,reduceexpr_method_call,branch0,branch0,branch0,reduceexpr_array_access,branch0,reduceexpr_array_assignment,branch0,reduceexpr_orif,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,branch0,reduceinstr_return,branch0,branch0,reduceinstr_fail,branch0,reduceinstr_continue,branch0,reduceinstr_expr,branch0,reduceexpr_while,reduceexpr_var_assignment,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,branch0,branch0,branch0,branch0,branch0,reduceexpr_new_call,reduceexpr_unary_not,reduceconst_member,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,reducefun_member,reduceinstr_star_3_rec,reducemember_star_0_rec,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] roptArray;
  @SuppressWarnings("unchecked")
  private void initroptArray() {
    roptArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_bor,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_ge,branch0,branch0,branch0,shift84,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_le,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,reduceexpr_attribute_assignment,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_band,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,reduceexpr_method_call,branch0,branch0,branch0,reduceexpr_array_access,branch0,reduceexpr_array_assignment,branch0,reduceexpr_orif,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_while,reduceexpr_var_assignment,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,branch0,branch0,branch0,branch0,branch0,reduceexpr_new_call,reduceexpr_unary_not,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] assignArray;
  @SuppressWarnings("unchecked")
  private void initassignArray() {
    assignArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift16,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift30,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift61,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift85,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _ifArray;
  @SuppressWarnings("unchecked")
  private void init_ifArray() {
    _ifArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift23,shift23,reduceexpr_null,branch0,branch0,shift23,reduceexpr_bool,shift23,reduceexpr_text,shift23,shift23,reduceexpr_integer,shift23,reduceexpr_var_access,shift23,reduceexpr_number,shift23,shift23,reduceexpr_unary_plus,shift23,reduceexpr_binary_mul,shift23,reduceexpr_binary_eq,shift23,reduceexpr_binary_or,shift23,reduceexpr_binary_bor,shift23,reduceexpr_binary_xor,shift23,reduceexpr_binary_ge,shift23,shift87,shift23,branch0,shift23,reduceexpr_binary_lt,shift23,reduceexpr_binary_and,shift23,reduceexpr_binary_le,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,shift23,reduceexpr_attribute_assignment,shift23,reduceexpr_binary_gt,shift23,reduceexpr_binary_sub,shift23,reduceexpr_binary_ne,shift23,reduceexpr_binary_band,shift23,reduceexpr_binary_add,shift23,reduceexpr_binary_div,shift23,reduceexpr_binary_mod,shift23,branch0,branch0,reduceexpr_method_call,branch0,shift23,branch0,reduceexpr_array_access,shift23,reduceexpr_array_assignment,shift23,reduceexpr_orif,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,reduceexpr_while_else,shift23,shift23,branch0,branch0,shift23,branch0,reduceinstr_print,shift23,branch0,branch0,reduceinstr_break,shift23,branch0,branch0,reduceinstr_return,shift23,branch0,reduceinstr_fail,branch0,reduceinstr_continue,branch0,reduceinstr_expr,reduceinstr_star_7_rec,reduceexpr_while,reduceexpr_var_assignment,shift23,branch0,branch0,shift23,branch0,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,branch0,reduceexpr_parens,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,reduceexpr_if_else,reduceexpr_if,branch0,branch0,shift23,branch0,branch0,reduceexpr_new_call,reduceexpr_unary_not,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift23,reduceinstr_star_3_rec,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _breakArray;
  @SuppressWarnings("unchecked")
  private void init_breakArray() {
    _breakArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,shift103,branch0,branch0,branch0,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,branch0,reduceinstr_return,branch0,branch0,reduceinstr_fail,branch0,reduceinstr_continue,branch0,reduceinstr_expr,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift103,reduceinstr_star_3_rec,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] lparArray;
  @SuppressWarnings("unchecked")
  private void initlparArray() {
    lparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,shift6,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift25,shift25,branch0,branch0,shift21,shift25,branch0,shift25,branch0,shift25,shift25,branch0,shift25,shift121,shift25,branch0,shift25,shift25,branch0,shift25,branch0,shift25,branch0,shift25,branch0,shift25,branch0,shift25,branch0,shift25,branch0,shift25,branch0,shift25,branch0,shift25,branch0,shift25,branch0,shift25,branch0,branch0,branch0,branch0,shift77,shift25,branch0,shift25,branch0,shift25,branch0,shift25,branch0,shift25,branch0,shift25,branch0,shift25,branch0,shift25,branch0,shift25,branch0,branch0,branch0,branch0,shift25,branch0,branch0,shift25,branch0,shift25,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,shift25,shift25,branch0,branch0,shift25,branch0,reduceinstr_print,shift25,branch0,branch0,reduceinstr_break,shift25,branch0,branch0,reduceinstr_return,shift25,branch0,reduceinstr_fail,branch0,reduceinstr_continue,branch0,reduceinstr_expr,reduceinstr_star_7_rec,branch0,branch0,shift25,branch0,branch0,shift25,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,branch0,branch0,branch0,shift25,branch0,branch0,branch0,branch0,branch0,branch0,shift150,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift25,reduceinstr_star_3_rec,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] dotArray;
  @SuppressWarnings("unchecked")
  private void initdotArray() {
    dotArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,shift59,branch0,shift59,branch0,shift59,branch0,shift59,branch0,shift59,branch0,shift59,branch0,shift59,branch0,shift59,branch0,shift59,branch0,shift59,branch0,shift59,branch0,shift59,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,shift59,branch0,shift59,branch0,shift59,branch0,shift59,branch0,shift59,branch0,shift59,branch0,shift59,branch0,shift59,branch0,shift59,branch0,reduceexpr_method_call,branch0,branch0,shift59,reduceexpr_array_access,branch0,shift59,branch0,shift59,shift59,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,shift59,branch0,branch0,shift59,branch0,branch0,shift59,branch0,branch0,branch0,shift59,branch0,branch0,branch0,shift59,branch0,branch0,branch0,shift59,branch0,branch0,reduceexpr_while,shift59,branch0,shift59,branch0,branch0,shift59,branch0,reduceexpr_fun_call,shift59,shift59,shift59,reduceexpr_parens,shift59,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift59,branch0,branch0,shift59,branch0,reduceexpr_new_call,shift59,shift59,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] gtArray;
  @SuppressWarnings("unchecked")
  private void initgtArray() {
    gtArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_or,branch0,shift63,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_ge,branch0,shift63,branch0,shift63,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_le,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,shift63,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_ne,branch0,shift63,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,shift63,branch0,reduceexpr_method_call,branch0,branch0,shift63,reduceexpr_array_access,branch0,shift63,branch0,shift63,shift63,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,shift63,branch0,branch0,shift63,branch0,branch0,shift63,branch0,branch0,branch0,shift63,branch0,branch0,branch0,shift63,branch0,branch0,branch0,shift63,branch0,branch0,reduceexpr_while,shift63,branch0,shift63,branch0,branch0,shift63,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,shift63,reduceexpr_parens,shift63,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift63,branch0,branch0,shift63,branch0,reduceexpr_new_call,reduceexpr_unary_not,shift63,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] minusArray;
  @SuppressWarnings("unchecked")
  private void initminusArray() {
    minusArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift28,shift28,reduceexpr_null,branch0,branch0,shift28,reduceexpr_bool,shift28,reduceexpr_text,shift28,shift28,reduceexpr_integer,shift28,reduceexpr_var_access,shift28,reduceexpr_number,shift28,shift28,reduceexpr_unary_plus,shift28,reduceexpr_binary_mul,shift28,shift65,shift28,reduceexpr_binary_or,shift28,shift65,shift28,reduceexpr_binary_xor,shift28,shift65,shift28,shift65,shift28,shift65,shift28,shift65,shift28,reduceexpr_binary_and,shift28,shift65,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,shift28,shift65,shift28,shift65,shift28,reduceexpr_binary_sub,shift28,shift65,shift28,shift65,shift28,reduceexpr_binary_add,shift28,reduceexpr_binary_div,shift28,reduceexpr_binary_mod,shift28,shift65,branch0,reduceexpr_method_call,branch0,shift28,shift65,reduceexpr_array_access,shift28,shift65,shift28,shift65,shift65,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,reduceexpr_while_else,shift28,shift28,shift65,branch0,shift28,shift65,reduceinstr_print,shift28,shift65,branch0,reduceinstr_break,shift28,shift65,branch0,reduceinstr_return,shift28,shift65,reduceinstr_fail,branch0,reduceinstr_continue,shift65,reduceinstr_expr,reduceinstr_star_7_rec,reduceexpr_while,shift65,shift28,shift65,branch0,shift28,shift65,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,shift65,reduceexpr_parens,shift65,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,reduceexpr_if_else,reduceexpr_if,shift65,branch0,shift28,shift65,branch0,reduceexpr_new_call,reduceexpr_unary_not,shift65,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift28,reduceinstr_star_3_rec,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] neArray;
  @SuppressWarnings("unchecked")
  private void initneArray() {
    neArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_bool,branch0,reduceexpr_text,branch0,branch0,reduceexpr_integer,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_unary_plus,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_or,branch0,shift67,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_ge,branch0,shift67,branch0,shift67,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_le,branch0,reduceexpr_is_instance,branch0,reduceexpr_attribute_access,branch0,shift67,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_ne,branch0,shift67,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,shift67,branch0,reduceexpr_method_call,branch0,branch0,shift67,reduceexpr_array_access,branch0,shift67,branch0,shift67,shift67,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,branch0,branch0,shift67,branch0,branch0,shift67,branch0,branch0,shift67,branch0,branch0,branch0,shift67,branch0,branch0,branch0,shift67,branch0,branch0,branch0,shift67,branch0,branch0,reduceexpr_while,shift67,branch0,shift67,branch0,branch0,shift67,branch0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,shift67,reduceexpr_parens,shift67,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift67,branch0,branch0,shift67,branch0,reduceexpr_new_call,reduceexpr_unary_not,shift67,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] failArray;
  @SuppressWarnings("unchecked")
  private void initfailArray() {
    failArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,shift111,branch0,branch0,branch0,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,branch0,reduceinstr_return,branch0,branch0,reduceinstr_fail,branch0,reduceinstr_continue,branch0,reduceinstr_expr,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,reduceinstr_star_7_empty,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift111,reduceinstr_star_3_rec,branch0,branch0,branch0};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] branchArrayTable;
  @SuppressWarnings("unchecked")
  private void initBranchArrayTable() {
    branchArrayTable=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reducemember_star_0_empty,reducescript,error0,reduceuse_member,error0,error0,error0,error0,error0,error0,reducedata_member,error0,error0,error0,error0,error0,error0,error0,reduceexpr_null,error0,error0,error0,reduceexpr_bool,error0,reduceexpr_text,error0,error0,reduceexpr_integer,error0,reduceexpr_var_access,error0,reduceexpr_number,error0,error0,reduceexpr_unary_plus,error0,reduceexpr_binary_mul,error0,reduceexpr_binary_eq,error0,reduceexpr_binary_or,error0,reduceexpr_binary_bor,error0,reduceexpr_binary_xor,error0,reduceexpr_binary_ge,error0,error0,error0,error0,error0,reduceexpr_binary_lt,error0,reduceexpr_binary_and,error0,reduceexpr_binary_le,error0,reduceexpr_is_instance,error0,reduceexpr_attribute_access,error0,reduceexpr_attribute_assignment,error0,reduceexpr_binary_gt,error0,reduceexpr_binary_sub,error0,reduceexpr_binary_ne,error0,reduceexpr_binary_band,error0,reduceexpr_binary_add,error0,reduceexpr_binary_div,error0,reduceexpr_binary_mod,error0,error0,error0,reduceexpr_method_call,error0,error0,error0,reduceexpr_array_access,error0,reduceexpr_array_assignment,error0,reduceexpr_orif,error0,error0,error0,error0,error0,error0,reduceexpr_while_else,error0,error0,error0,error0,error0,error0,reduceinstr_print,error0,error0,error0,reduceinstr_break,error0,error0,error0,reduceinstr_return,error0,error0,reduceinstr_fail,error0,reduceinstr_continue,error0,reduceinstr_expr,error0,reduceexpr_while,reduceexpr_var_assignment,error0,error0,error0,error0,error0,error0,reduceexpr_fun_call,reduceexpr_unary_minus,reduceexpr_unary_complement,error0,reduceexpr_parens,error0,error0,error0,error0,error0,error0,reduceexpr_if_else,reduceexpr_if,error0,error0,error0,error0,error0,reduceexpr_new_call,reduceexpr_unary_not,reduceconst_member,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceinstr_star_3_empty,reducefun_member,reduceinstr_star_3_rec,reducemember_star_0_rec,exit,exit};
  }

  private final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> table;
  
  public static final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> createTable() {
    return new ParserDataTable().table;
  }

  private final AcceptAction<TerminalEnum,ProductionEnum,VersionEnum> accept;
  private final ExitAction<TerminalEnum,ProductionEnum,VersionEnum> exit;

  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_1_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_fun_call;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_le;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_if;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_8_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_return;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceuse_member;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_add;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_div;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_complement;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceconst_member;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_bor;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_is_instance;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducefun_member;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_ge;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_minus;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_method_call;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_parens;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_xor;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_sub;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_new_call;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_optional_5_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_10_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_orif;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_plus_6_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_while_else;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_continue;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_print;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_mod;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_8_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_2_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_integer;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_10_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_band;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_optional_5_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_8_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_gt;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_mul;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_var_assignment;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_var_access;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_plus;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_not;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_9_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_bool;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_star_3_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_plus_6_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_or;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducemember_star_0_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_attribute_access;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_star_7_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_10_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_array_assignment;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_9_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_9_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_attribute_assignment;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_array_access;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_8_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_2_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_while;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_2_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducedata_member;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_10_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_ne;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_if_else;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_optional_4_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_eq;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_null;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_lt;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_9_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_1_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_1_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducemember_star_0_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducescript;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_and;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_star_7_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_optional_4_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_number;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_text;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_break;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_fail;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_1_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_2_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_star_3_rec;

  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift3;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift25;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift149;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift97;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift6;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift85;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift113;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift69;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift4;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift58;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift22;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift20;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift157;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift5;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift119;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift7;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift59;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift95;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift23;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift17;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift138;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift16;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift135;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift24;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift49;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift115;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift75;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift60;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift145;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift39;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift18;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift28;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift124;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift100;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift61;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift121;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift31;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift41;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift29;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift102;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift65;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift111;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift148;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift51;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift15;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift156;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift12;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift87;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift32;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift92;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift136;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift114;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift133;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift131;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift73;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift21;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift106;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift152;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift139;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift117;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift71;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift2;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift14;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift142;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift80;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift27;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift67;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift107;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift47;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift63;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift30;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift150;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift45;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift35;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift57;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift10;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift127;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift43;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift26;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift55;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift33;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift19;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift77;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift53;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift84;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift110;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift93;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift90;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift82;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift103;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift37;


  private final ErrorAction<TerminalEnum,ProductionEnum,VersionEnum> error0;

  private final BranchAction<TerminalEnum,ProductionEnum,VersionEnum> branch0;


  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0__eof___metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_optional_5_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ropt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0comma_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceuse_member;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0number_metadata0reduceexpr_number;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0dot_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_metadata0reduceinstr_star_3_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0gt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_if_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0slash_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_const_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_while_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0star_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0end_metadata0reduceexpr_if_else;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eol_metadata0reduceinstr_continue;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eol_metadata0reduceinstr_return;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_optional_4_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0colon_metadata0reduceinstr_star_7_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_continue_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_method_call;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0member_star_0_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0plus_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_fun_call;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0text_metadata0reduceexpr_text;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_plus_6_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0print_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0bang_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_else_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_star_7_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0minus_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_9_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_new_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0or_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0integer_metadata0reduceexpr_integer;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eol_metadata0reduceinstr_expr;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eq_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0colon_metadata0reduceinstr_star_3_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0null_metadata0reducemember_star_0_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0member_metadata0reducemember_star_0_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_8_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0end_metadata0reduceexpr_if;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_star_2_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_metadata0reduceparameter_star_1_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_star_1_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0is_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0bool_metadata0reduceexpr_bool;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0mod_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_new_call;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reducedata_member;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_star_3_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0nulz_metadata0reduceexpr_null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eol_metadata0reduceinstr_print;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceparameter;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eol_metadata0reduceinstr_fail;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_10_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_star_1_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_10_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0assign_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ge_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0xor_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0data_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0amp_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lpar_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_metadata0reduceparameter_star_1_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ne_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0damp_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_parens;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0script_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_8_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_star_2_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0fail_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_return_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0end_metadata0reduceexpr_while_else;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0dpipe_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_9_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_break_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lopt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_metadata0reduceinstr_star_7_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_metadata0reduceparameter_star_2_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0end_metadata0reduceexpr_while;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0pipe_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_metadata0reduceparameter_star_2_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eol_metadata0reduceinstr_break;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0le_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0def_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0use_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceexpr_is_instance;
}
