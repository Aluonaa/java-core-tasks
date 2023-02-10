package main.java.ru.furiosaming.javacoretasks.chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exercise6 {
   /** В разделе 5.1.6 приведен пример ошибочного внедрения блока операторов
    catch и finally в блок кода оператора try. Исправьте этот код, во-первых,
    перехватив исключение в операторе finally, во-вторых, внедрив блок операторов
    try/finally в блок операторов try/catch, и в-третьих, применив оператор
    try с ресурсами вместе с оператором catch.

    BufferedReader in = null;
    try {
    in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
    Читать из стандартного потока ввода in
    } catch (IOException ex) {
    System.err.println("Caught IOException: " + ex.getMessage());
    } finally {
    if (in != null) {
    in.close(); // ВНИМАНИЕ: может быть сгенерировано исключение!
    }
    }
    */

   public static void main(String[] args) throws IOException {

       // try с ресурсами вместе с оператором catch
       try(BufferedReader in = Files.newBufferedReader(Paths.get(
               "src/main/resources/textFiles/5.6.txt"),StandardCharsets.UTF_8)) {
           System.out.println(in.readLine());
       } catch (IOException ex) {
           System.err.println("Caught IOException: " + ex.getMessage());
       }

       //перехват исключения в операторе finally
       BufferedReader in = null;
       try {
           in = Files.newBufferedReader(Paths.get(
                   "src/main/resources/textFiles/5.6.txt"),StandardCharsets.UTF_8);
           System.out.println(in.readLine());
       } catch (IOException ex) {
           System.err.println("Caught IOException: " + ex.getMessage());
       } finally {
           try {
               if(in != null) in.close();
           } catch (IOException ex){
               System.err.println("Caught IOException: " + ex.getMessage());
           }
       }

       //внедрение блоков операторов try/finally в блок операторов try/catch
       BufferedReader in2 = null;
       try {
           in2 = Files.newBufferedReader(Paths.get(
                   "src/main/resources/textFiles/5.6.txt"),StandardCharsets.UTF_8);
           System.out.println(in2.readLine());
       } catch (IOException ex) {
           try {
               if(in2 != null) in2.close();
           } finally {
               System.err.println("Caught IOException: " + ex.getMessage());
           }
       }
   }

}
