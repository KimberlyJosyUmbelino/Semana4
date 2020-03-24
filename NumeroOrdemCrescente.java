import javax.swing.JOptionPane;
public class NumeroOrdemCrescente
{
   public static void main(String[]args)
   {
   //Leitura de dados
    
    String sN1 = JOptionPane.showInputDialog("Digite o 1º numero: ");
    String sN2 = JOptionPane.showInputDialog("Digite o 2º numero: ");
    String sN3 = JOptionPane.showInputDialog("Digite o 3º numero: ");
    //Convertendo para real
      int n1 = Integer.parseInt(sN1);
      int n2 = Integer.parseInt(sN2);
      int n3 = Integer.parseInt(sN3);

  if (n1>n2)
  {
   if(n2<n3)
   {
    if(n1>n3)
    {
      JOptionPane.showMessageDialog(null,n2+", "+n3+","+n1); 
    }
    else
    {
      JOptionPane.showMessageDialog(null,n2+", "+n1+","+n3); 
    }     
   }
   else
   {
     JOptionPane.showMessageDialog(null,n3+", "+n2+","+n1); 
   }
  }
  else
  {
   if(n2>n3)
   {
    if (n1>n3)
    {
      JOptionPane.showMessageDialog(null,n3+", "+n1+","+n2); 
    }
      JOptionPane.showMessageDialog(null,n1+", "+n3+","+n2); 
   }
   else
   {
    JOptionPane.showMessageDialog(null,n1+", "+n2+","+n3); 
   }
  }
  }
}