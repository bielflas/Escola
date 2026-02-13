package lingua.linguagens.java;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

import javax.swing.*;


public class Principal {
    
public static void main(String[] args){
            /*perguntas: gerais */ 

     LocalDate nascimento = null;

      try {
          String nome = JOptionPane.showInputDialclick here for group info
          ￼
          ￼
          Sunday
          Use WhatsApp on your phone to see older messages from before 3/8/2025.
          6/1/2025
          Forwarded
          ￼￼
          21:48
          6/2/2025
          ￼￼￼
          13:15
          ￼￼￼￼
          13:15
          Thursday
          jogos de graca que a luna manda no ttk
          20:05
          Sunday
          ￼ 1. Narrador
          O narrador de A Senhora é:
          
          Terceira pessoa onisciente: Ele não participa da história, mas conhece intimamente os pensamentos, sentimentos e motivações dos personagens, especialmente os de Aurélia e Fernando.
          
          Estilo elegante e crítico: Apesar de não se intrometer diretamente, o narrador faz comentários que revelam uma crítica à sociedade burguesa do século XIX, especialmente ao casamento por interesse e à hipocrisia social.
          
          Romântico, mas com ironia: José de Alencar, por meio do narrador, mistura o sentimentalismo romântico com certa ironia, especialmente ao tratar da vaidade, do orgulho e da manipulação social.
          
          ￼ 2. Personagens
          ￼ Aurélia Camargo
          Jovem órfã, vive inicialmente em condições modestas.
          
          Após a morte do avô materno, herda uma g…Read more
          12:36
          Boa tarde, o narrador de a senhora, é em terceira pessoa, ele nao participa da historia, mas conhece os pensamentos dos personagens; Ele tem um estilo elegante e critico, faz comentarios que revelam uma critica a sociedade burguesa no seculo 19, especialmente ao casamento por interesse e a hipocrisia social. Ele utiliza de uma mistura do sentimentalismo romantico, com certa ironia, especialmente ao tratar da vaidade, do orgulho e da manipulação social.
          
          Agora falando um pouco dos personagens, temos
          og("Your name is: ");
          if (nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("Nomclick here for group info
￼
￼
Sunday
Use WhatsApp on your phone to see older messages from before 3/8/2025.
6/1/2025
Forwarded
￼￼
21:48
6/2/2025
￼￼￼
13:15
￼￼￼￼
13:15
Thursday
jogos de graca que a luna manda no ttk
20:05
Sunday
￼ 1. Narrador
O narrador de A Senhora é:

Terceira pessoa onisciente: Ele não participa da história, mas conhece intimamente os pensamentos, sentimentos e motivações dos personagens, especialmente os de Aurélia e Fernando.

Estilo elegante e crítico: Apesar de não se intrometer diretamente, o narrador faz comentários que revelam uma crítica à sociedade burguesa do século XIX, especialmente ao casamento por interesse e à hipocrisia social.

Romântico, mas com ironia: José de Alencar, por meio do narrador, mistura o sentimentalismo romântico com certa ironia, especialmente ao tratar da vaidade, do orgulho e da manipulação social.

￼ 2. Personagens
￼ Aurélia Camargo
Jovem órfã, vive inicialmente em condições modestas.

Após a morte do avô materno, herda uma g…Read more
12:36
Boa tarde, o narrador de a senhora, é em terceira pessoa, ele nao participa da historia, mas conhece os pensamentos dos personagens; Ele tem um estilo elegante e critico, faz comentarios que revelam uma critica a sociedade burguesa no seculo 19, especialmente ao casamento por interesse e a hipocrisia social. Ele utiliza de uma mistura do sentimentalismo romantico, com certa ironia, especialmente ao tratar da vaidade, do orgulho e da manipulação social.

Agora falando um pouco dos personagens, temos
e nao pode estar vazia");
          }

          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

     
          String nascimentoStr = JOptionPane.showInputDialog("Your nasciment is(Year/Month/day): ");
          if (nascimento == null || nascimento.isEmpty()){
            throw new IllegalArgumentException("Nascimento nao pode estar vazia");
          }

          String curso = JOptionPane.showInputDialog(null,  "Your course is: ");
          if (curso == null || curso.isEmpty()) {
            throw new IllegalArgumentException("Curso nao pode estar vazio");
          } 

          if (isNumeric(curso)){
            throw new IllegalArgumentException("Não pode haver numeros no curso");
          }


          /* int anoAtual = LocalDate.now().getYear();
          int anoNascimento = anoAtual - idade;

          idadeInput = LocalDate.parse(nascimento, formatter);

          LocalDate idade = Integer.parseInt(nascimento); */
          
        

            /*aluno: */
        Aluno luccas = new Aluno(nome, nascimento, curso);{  
      JOptionPane.showMessageDialog(null, "Your age is: " +  luccas.calcularIdade());
      JOptionPane.showMessageDialog(null, "Your name is: " + nome);
      JOptionPane.showMessageDialog(null, "Your course is: " + curso);
      luccas.assistindoAula("java ");
      luccas.assistindoAula(",java script ");
      luccas.assistindoAula(",sistema operacional");
      JOptionPane.showMessageDialog(null, "Your watched classes is: " + luccas.aulasAssistidas);
          }

        } catch (NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Erro: A idade deve ser um número válido.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        }
        catch (IllegalArgumentException e){
          JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }


        /*exibições */
        ArrayList<String> formacoes = new ArrayList<>();
      formacoes.add("Mestrado em " + curso);

        Professor joao = new Professor(nome, nascimento, curso, "tecnologia", formacoes);{
      JOptionPane.showMessageDialog(null,"Hello teacher, your name is: " + joao.getNome());
      JOptionPane.showMessageDialog(null,"Teacher, your course is: " + curso);
      JOptionPane.showMessageDialog(null, "Your age is: " +  joao.calcularIdade());
      joao.darAulas("java");
      JOptionPane.showMessageDialog(null, joao.relacaoAula());
      } 
    }
    private static boolean isNumeric(String str) {
      return str.matches("\\d+");
      }
}



 //* JOptionPane.showMessageDialog(null, "Your watched classes is: " + relacao); acho que nao faz sentido voce colocar as suas aulas assistidas
//*JOptionPane.showMessageDialog(null, "Your age is: " + luccas.calcularIdade());Professor wendel = new Professor(nome, idade, curso, curso, null){
/* PROFESSOR */ 
    /* JOptionPane.showMessageDialog(null, "Your name is: " + nome);
    JOptionPane.showMessageDialog(null, "Your age is: " +  calcularIdade());
    JOptionPane.showMessageDialog(null, "Your course is: " + formackage lingua.linguagens.java;*/
