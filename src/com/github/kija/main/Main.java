package com.github.kija.main;

import com.github.kija.interpreter.Interpreter;
import com.github.kija.parser.Parser;
import com.github.kija.parser.ast.Script;
import com.github.kija.runtime.Engine;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
  public static void main(String[] args) throws Throwable {
    Engine engine = new Engine();
    if (args.length >= 1) {
      if (args[0].equals("-i")) {
        Path path = Paths.get(args[1]);
        try (BufferedReader reader = Files.newBufferedReader(path)) {
          Script script = Parser.parse(reader);
          Interpreter interpreter = new Interpreter(script, args);
          interpreter.interpret();
        }
      } else {
        engine.run(Paths.get(args[0]), args);
      }
    } else {
      engine.run("<stdin>", new java.io.InputStreamReader(System.in), args);
    }
  }
}
