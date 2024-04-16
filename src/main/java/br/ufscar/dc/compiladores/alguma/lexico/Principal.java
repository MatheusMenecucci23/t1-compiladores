package br.ufscar.dc.compiladores.alguma.lexico;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class Principal {

    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 2) {
            System.err.println("Uso: java Principal <arquivo_entrada> <arquivo_saida>");
            System.exit(1);
        }

        String inputFile = args[0];
        String outputFile = args[1];

        try {
            CharStream cs = CharStreams.fromFileName(inputFile);
            AlgumaLexer lex = new AlgumaLexer(cs);

            File output = new File(outputFile);
            PrintWriter writer = new PrintWriter(new FileOutputStream(output));

            while (true) {
                Token token = lex.nextToken();
                int type = token.getType();

                if (type == Token.EOF) {
                    writer.close();
                    break;
                }

                if( AlgumaLexer.tokenNames[type] == "COMENTARIO_NAO_FECHADO"){
                    writer.printf("Linha %d: comentario nao fechado\n",
                    token.getLine());
                } else if( AlgumaLexer.tokenNames[type] == "CADEIA_NAO_FECHADA"){
                    writer.printf("Linha %d: cadeia literal nao fechada\n",
                    token.getLine());
                }
                else if( AlgumaLexer.tokenNames[type] == "SimboloNaoIdentificado"){
                    String simbolo = token.getText();
                    writer.printf("Linha %d: %s - simbolo nao identificado\n",
                    token.getLine(),simbolo.charAt(0));
                }
                else{
                    // Enhanced output format with line numbers and token information
                    writer.printf("<'%s',%s>\n",
                    token.getText(),AlgumaLexer.tokenNames[type]);
                }

            }

            System.out.println("Tokens processados e salvos em \"" + outputFile + "\".");
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de entrada ou gravar no arquivo de saída: " + e.getMessage());
        }
    }
}
//java -jar /home/matheus/corretor/compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar " java -jar /home/matheus/Documents/cc/alguma-lexico/target/alguma-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar" gcc home/corretor/temp /home/matheus/corretor/casos-de-teste/casos-de-teste "800310" t1