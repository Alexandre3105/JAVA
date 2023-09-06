/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author alunodev08
 */
public class Funcionario {
    Scanner src = new Scanner(System.in);
  int nf;
  int matricula ;
  String nome ;
  String cargoAtual;
  float salarioAtual;
    
   

 void cadastrar(){
     System.out.println("Nome:\n");
     nome = src.next();
     System.out.println("Matricula:\n");
     matricula = src.nextInt();
     System.out.println("Salario Atual:");
     salarioAtual = src.nextFloat();
     System.out.println("cargoAtual:");
     cargoAtual = src.next();
     nf++;
     
 }
  
 void consultar() {
     System.out.println("Matricula:"+matricula);
     System.out.println("Nome:"+nome);
     System.out.println("Cargo Atual:"+cargoAtual);
     System.out.println("Salario Atual :R$"+salarioAtual);
      
  }
    int atualizarSalario(float novoSalario){
      
      System.out.println("Digite sua matricula para sua segurança:");
     int matriculaC = src.nextInt();
      if(this.matricula == matriculaC){
          return 1;
          
      }else{
          System.out.println("Matricula invalida");
          return 0;
      }
      System.out.println("Novo salario:");
      novoSalario = src.nextFloat();
      this.salarioAtual = novoSalario;
  }
  void listarDependentes(){
      
      
  }
  
}
