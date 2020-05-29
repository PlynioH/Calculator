package calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela
{
    private JTextField textField1;
    private JTextField textField2;
    private JButton Calcular;
    private JCheckBox Adição;
    private JCheckBox Divisão;
    private JCheckBox Multiplicação;
    private JCheckBox Subtração;
    private JLabel Result;
    private JPanel Jpanel;

    public Tela()
    {
        Calcular.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                var result = "";
                if(Adição.isSelected())
                {
                    result ="Adição:" + Integer.toString(Integer.parseInt(textField1.getText()) + Integer.parseInt(textField2.getText()));
                    Result.setText(result);
                }
                if (Divisão.isSelected())
                {
                    result =  result + " Divisão:" + Integer.toString(Integer.parseInt(textField1.getText()) / Integer.parseInt(textField2.getText()));
                    Result.setText(result);
                }
                if (Multiplicação.isSelected())
                {
                    result =  result + " Multiplicação:" + Integer.toString(Integer.parseInt(textField1.getText()) * Integer.parseInt(textField2.getText()));
                    Result.setText(result);
                }
                if (Subtração.isSelected())
                {
                    result =  result + " Subtração:" + Integer.toString(Integer.parseInt(textField1.getText()) - Integer.parseInt(textField2.getText()));
                    Result.setText(result);
                }


            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Tela");
        frame.setContentPane(new Tela().Jpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

