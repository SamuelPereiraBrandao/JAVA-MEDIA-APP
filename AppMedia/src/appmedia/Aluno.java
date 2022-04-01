/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmedia;

import javax.swing.JOptionPane;

/**
 *
 * @author arthu
 */
public class Aluno {
float nota1, nota2, nota3, nota4, mediaparcial;
final float mediafinal = 6.0f;

//Construtor

{
        nota1 = nota2 = nota3 = nota4 = 0.0f;
        mediaparcial = 0.0f;
}
    
float media(){
            nota1=Float.parseFloat(JOptionPane.showInputDialog("Digite a Pimeira Nota"));
            nota2=Float.parseFloat(JOptionPane.showInputDialog("Digite a Segunda Nota"));
            nota3=Float.parseFloat(JOptionPane.showInputDialog("Digite a Terceira Nota"));
            nota4=Float.parseFloat(JOptionPane.showInputDialog("Digite a Quarta Nota"));
//nota 1
 if(nota1 <= nota2 && nota1 <= nota3 && nota1 <= nota4){
        nota1=0;
    }
    //nota 2 
    if(nota2 <= nota1 && nota2 <= nota3 && nota2 <= nota4){
        nota2=0;
    }
    // nota 3 
    if(nota3 <= nota1 && nota3 <= nota2 && nota3 <= nota4){
        nota3=0;
    }
    //nota 4 
    if(nota4 <= nota1 && nota4 <= nota2 && nota4 <= nota3){
        nota4=0;
    }

    mediaparcial= (nota1 + nota2 + nota3 + nota4)/3;    
    
    return mediaparcial;
}
        
String situacao(){
    
   if(media() >= mediafinal){
           JOptionPane.showMessageDialog(null, "Aprovado com a média de: "+mediaparcial);
        }else{
            JOptionPane.showMessageDialog(null, "Reprovado com a média de: "+mediaparcial);
        }
    return null;
}


}
