import javax.swing.JOptionPane;
public class SomaSejaMaiorMenos5
{
   public static void main (String[]args)
   {
   //Leitura de dados
   String sN1 = JOptionPane.showInputDialog("Digite um número:");
   String sN2 = JOptionPane.showInputDialog("Digite um segundo número:");
   //Convertendo para inteiro
   int n1 = Integer.parseInt(sN1);
   int n2 = Integer.parseInt(sN2);
   //Calculando o valor caso somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se 5
   int soma;
   soma=n1+n2;
   //Apresentação em tela
      if(soma<=20)
      {
      soma=soma-5;
         JOptionPane.showMessageDialog(null,"Resultado:"+soma,"Resposta:",JOptionPane.PLAIN_MESSAGE);
      }

   }
}   
   