import javax.swing.JOptionPane;
public class RaizQuadradaOuQuadrado
{
   public static void main(String[]args)
   {
   //Leitura de dados
   double resposta;
   String sNum = JOptionPane.showInputDialog("Digite um número");
   //Converção
   double num = Double.parseDouble(sNum);
   //Calculo
   if(num>0)
      {
        resposta = Math.pow(num,0.5);
       //apresentando resultado
        JOptionPane.showMessageDialog(null,"O resultado é:" +resposta,"Resposta:",JOptionPane.PLAIN_MESSAGE);
      }
   else
      {
       resposta=Math.pow(num,2);
       //apresentando resultado
       JOptionPane.showMessageDialog(null,"Resultado: "+num+" temos: "+resposta,"Resposta:",JOptionPane.PLAIN_MESSAGE);
      }

   }
}
   