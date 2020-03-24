import javax.swing.JOptionPane;
public class Soma
{
   public static void main(String[]args)
   {
   //Leitura de dados
      String sN1 = JOptionPane.showInputDialog("Digite um número:");
      String sN2 = JOptionPane.showInputDialog("Digite um segundo número:");
   //Convertendo para inteiro
      int n1 = Integer.parseInt(sN1);
      int n2 = Integer.parseInt(sN2);
   //Calculo da soma
      int soma = n1 + n2;
   //apresentando se o resultado for maior que 10
      if(soma>10)
      {
         JOptionPane.showMessageDialog(null,"Resultado:"+soma,"Resposta:",JOptionPane.PLAIN_MESSAGE);
      }
    }
}
    