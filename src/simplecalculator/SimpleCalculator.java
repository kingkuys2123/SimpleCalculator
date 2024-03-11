/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package simplecalculator;

/**
 *
 * @author Quitco, Kyle Matthew     BSIT - 2        CSIT228 - G1    October 13, 2023
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator {
    
    char operator='\0';
    float num1=0, num2=0, result=-1;
    boolean tempEquals=false;

    @SuppressWarnings("empty-statement")
    public SimpleCalculator(){
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(350,520);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setLayout(null);
        
        JTextField textfield = new JTextField("0");
        textfield.setFont(new Font("Verdana",Font.PLAIN,30));
        textfield.setBounds(15, 30,305,60);
        textfield.setEditable(false);
        textfield.setHorizontalAlignment(JTextField.RIGHT);;
        
        frame.add(textfield);
        
        JLabel label = new JLabel("");
        label.setBounds(15,0,305,30);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setForeground(Color.gray);
        frame.add(label);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(15, 100, 305, 300);
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));
        
        String[] temp = {"Del", "CE", "C", "/", "7", "8", "9", "*", "4", "5", "6", "-", "1", "2", "3", "+"};

        JButton[] buttons = new JButton[16];
        
        for(int i=0; i<16; i++){
            buttons[i] = new JButton("" + temp[i]);
            buttonPanel.add(buttons[i]);
        }
        
        JButton zeroButton = new JButton("0");
        JButton equalsButton = new JButton("=");
        JButton periodButton = new JButton(".");
        
        zeroButton.setBounds(15, 410, 147, 60);
        periodButton.setBounds(173, 410, 67, 60);
        equalsButton.setBounds(250, 410, 67, 60);
        
        frame.add(buttonPanel);
        frame.add(zeroButton);
        frame.add(periodButton);
        frame.add(equalsButton);
        
        buttons[12].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp = textfield.getText();
                
                if("0".equals(temp)){
                    textfield.setText("1");
                }
                else if(tempEquals==true){
                    tempEquals=false;
                    label.setText("");
                    num1=0;
                    num2=0;
                    result=-1;
                    operator='\0';
                    textfield.setText("1");
                }
                else{
                    textfield.setText(textfield.getText() + "1");
                }
                
            }
        });
        
        buttons[13].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp = textfield.getText();
                
                if("0".equals(temp)){
                    textfield.setText("2");
                }
                else if(tempEquals==true){
                    tempEquals=false;
                    label.setText("");
                    num1=0;
                    num2=0;
                    result=-1;
                    operator='\0';
                    textfield.setText("2");
                }
                else{
                    textfield.setText(textfield.getText() + "2");
                }
            }
        });
        
        buttons[14].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp = textfield.getText();
                
                if("0".equals(temp)){
                    textfield.setText("3");
                }
                else if(tempEquals==true){
                    tempEquals=false;
                    label.setText("");
                    num1=0;
                    num2=0;
                    result=-1;
                    operator='\0';
                    textfield.setText("3");
                }
                else{
                    textfield.setText(textfield.getText() + "3");
                }
            }
        });
        
        buttons[8].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp = textfield.getText();
                
                if("0".equals(temp)){
                    textfield.setText("4");
                }
                else if(tempEquals==true){
                    tempEquals=false;
                    label.setText("");
                    num1=0;
                    num2=0;
                    result=-1;
                    operator='\0';
                    textfield.setText("4");
                }
                else{
                    textfield.setText(textfield.getText() + "4");
                }
            }
        });
        
        buttons[9].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp = textfield.getText();
                
                if("0".equals(temp)){
                    textfield.setText("5");
                }
                else if(tempEquals==true){
                    tempEquals=false;
                    label.setText("");
                    num1=0;
                    num2=0;
                    result=-1;
                    operator='\0';
                    textfield.setText("5");
                }
                else{
                    textfield.setText(textfield.getText() + "5");
                }
            }
        });
        
        buttons[10].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp = textfield.getText();
                
                if("0".equals(temp)){
                    textfield.setText("6");
                }
                else if(tempEquals==true){
                    tempEquals=false;
                    label.setText("");
                    num1=0;
                    num2=0;
                    result=-1;
                    operator='\0';
                    textfield.setText("6");
                }
                else{
                    textfield.setText(textfield.getText() + "6");
                }
            }
        });
        
        buttons[4].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp = textfield.getText();
                
                if("0".equals(temp)){
                    textfield.setText("7");
                }
                else if(tempEquals==true){
                    tempEquals=false;
                    label.setText("");
                    num1=0;
                    num2=0;
                    result=-1;
                    operator='\0';
                    textfield.setText("7");
                }
                else{
                    textfield.setText(textfield.getText() + "7");
                }
            }
        });
        
        buttons[5].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp = textfield.getText();
                
                if("0".equals(temp)){
                    textfield.setText("8");
                }
                else if(tempEquals==true){
                    tempEquals=false;
                    label.setText("");
                    num1=0;
                    num2=0;
                    result=-1;
                    operator='\0';
                    textfield.setText("8");
                }
                else{
                    textfield.setText(textfield.getText() + "8");
                }
            }
        });
        
        buttons[6].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp = textfield.getText();
                
                if("0".equals(temp)){
                    textfield.setText("9");
                }
                else if(tempEquals==true){
                    tempEquals=false;
                    label.setText("");
                    num1=0;
                    num2=0;
                    result=-1;
                    operator='\0';
                    textfield.setText("9");
                }
                else{
                    textfield.setText(textfield.getText() + "9");
                }
            }
        });
        
        zeroButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp = textfield.getText();
                
                if("0".equals(temp)){
                    textfield.setText("0");
                }
                else if(tempEquals==true){
                    tempEquals=false;
                    label.setText("");
                    num1=0;
                    num2=0;
                    result=-1;
                    operator='\0';
                    textfield.setText("0");
                }
                else{
                    textfield.setText(textfield.getText() + "0");
                }
            }
        });
        
        periodButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp = textfield.getText();
                
                if(!temp.contains(".")){
                    textfield.setText(textfield.getText() + ".");
                }
                
            }
        });
        
        buttons[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textfield.setText("0");
                label.setText("");
                num1=0;
                num2=0;
                result=-1;
                operator='\0';
            }
        });
        
        buttons[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textfield.setText("0");
            }
        });
        
        equalsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(operator!='\0'){
                    tempEquals=true;
                    
                    if(result==(num1+num2) || result==(num1-num2) || result==(num1/num2)){
                        num1 = Float.parseFloat(textfield.getText());
                    }
                    else if(result==(num1*num2) && !"0".equals(textfield.getText())){
                        num1 = Float.parseFloat(textfield.getText());
                    }
                    else if(result==(num1*num2) && "0".equals(textfield.getText())){
                        num1 = Float.parseFloat(textfield.getText());
                    }
                    else{
                        num2 = Float.parseFloat(textfield.getText());
                    }
                    
                    if(operator=='+'){
                        result = num1+num2;
                    }
                    else if(operator=='-'){
                        result = num1-num2;
                    }
                    else if(operator=='/'){
                        result = num1/num2;
                    }
                    else if(operator=='*'){
                        result = num1*num2;
                    }
                    
                    int tempResult = (int) result;
                    
                    if(num1%1==0 & num2%1==0){
                        int tempNum1 = (int) num1;
                        int tempNum2 = (int) num2;
                        label.setText(String.valueOf(tempNum1) + String.valueOf(operator) + String.valueOf(tempNum2) + " =");
                    }
                    else if(num1%1==0){
                        int tempNum1 = (int) num1;
                        label.setText(String.valueOf(tempNum1) + String.valueOf(operator) + String.valueOf(num2) + " =");
                    }
                    else if(num2%1==0){
                        int tempNum2 = (int) num2;
                        label.setText(String.valueOf(num1) + String.valueOf(operator) + String.valueOf(tempNum2) + " =");
                    }
                    else{
                        label.setText(String.valueOf(num1) + String.valueOf(operator) + String.valueOf(num2) + " =");
                    }
                    
                    if(result%1==0){
                        textfield.setText(String.valueOf(tempResult));
                    }
                    else{
                        textfield.setText(String.valueOf(result));
                    }
                    
                }
                
            }
        });
                
                
        buttons[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp = textfield.getText();
                
                temp = temp.substring(0, temp.length()-1);
                
                if("".equals(temp)){
                    textfield.setText("0");
                }
                else{
                    textfield.setText(temp);    
                }
                
            }
        });
        
        buttons[15].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                if(operator=='\0'){
                    num1 = Float.parseFloat(textfield.getText());
                    operator = '+';

                    if(num1%1==0){
                        int tempNum1 = (int) num1;
                        label.setText(String.valueOf(tempNum1) + String.valueOf(operator));
                    }
                    else{
                        label.setText(String.valueOf(num1) + String.valueOf(operator));
                    }

                    textfield.setText("0");
                }
                else if(tempEquals==true){
                    tempEquals=false;
                    num1 = Float.parseFloat(textfield.getText());
                    operator = '+';

                    if(num1%1==0){
                        int tempNum1 = (int) num1;
                        label.setText(String.valueOf(tempNum1) + String.valueOf(operator));
                    }
                    else{
                        label.setText(String.valueOf(num1) + String.valueOf(operator));
                    }

                    textfield.setText("0");
                }
                else{
                    num1 += Float.parseFloat(textfield.getText());
                    operator = '+';

                    if(num1%1==0){
                        int tempNum1 = (int) num1;
                        label.setText(String.valueOf(tempNum1) + String.valueOf(operator));
                    }
                    else{
                        label.setText(String.valueOf(num1) + String.valueOf(operator));
                    }

                    textfield.setText("0");    
                }
                
            }
        });
        
        buttons[11].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(operator=='\0'){
                    num1 = Float.parseFloat(textfield.getText());
                    operator = '-';

                    if(num1%1==0){
                        int tempNum1 = (int) num1;
                        label.setText(String.valueOf(tempNum1) + String.valueOf(operator));
                    }
                    else{
                        label.setText(String.valueOf(num1) + String.valueOf(operator));
                    }

                    textfield.setText("0");
                }
                else if(tempEquals==true){
                    tempEquals=false;
                    num1 = Float.parseFloat(textfield.getText());
                    operator = '-';

                    if(num1%1==0){
                        int tempNum1 = (int) num1;
                        label.setText(String.valueOf(tempNum1) + String.valueOf(operator));
                    }
                    else{
                        label.setText(String.valueOf(num1) + String.valueOf(operator));
                    }

                    textfield.setText("0");
                }
                else{
                    num1 -= Float.parseFloat(textfield.getText());
                    operator = '-';

                    if(num1%1==0){
                        int tempNum1 = (int) num1;
                        label.setText(String.valueOf(tempNum1) + String.valueOf(operator));
                    }
                    else{
                        label.setText(String.valueOf(num1) + String.valueOf(operator));
                    }

                    textfield.setText("0");    
                }
            }
        });
        
        buttons[7].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(operator=='\0'){
                    num1 = Float.parseFloat(textfield.getText());
                    operator = '*';

                    if(num1%1==0){
                        int tempNum1 = (int) num1;
                        label.setText(String.valueOf(tempNum1) + String.valueOf(operator));
                    }
                    else{
                        label.setText(String.valueOf(num1) + String.valueOf(operator));
                    }

                    textfield.setText("0");
                }
                else if(tempEquals==true){
                    tempEquals=false;
                    num1 = Float.parseFloat(textfield.getText());
                    operator = '*';

                    if(num1%1==0){
                        int tempNum1 = (int) num1;
                        label.setText(String.valueOf(tempNum1) + String.valueOf(operator));
                    }
                    else{
                        label.setText(String.valueOf(num1) + String.valueOf(operator));
                    }

                    textfield.setText("0");
                }
                else{
                    num1 *= Float.parseFloat(textfield.getText());
                    operator = '*';

                    if(num1%1==0){
                        int tempNum1 = (int) num1;
                        label.setText(String.valueOf(tempNum1) + String.valueOf(operator));
                    }
                    else{
                        label.setText(String.valueOf(num1) + String.valueOf(operator));
                    }

                    textfield.setText("0");    
                }
            }
        });
        
        buttons[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(operator=='\0'){
                    num1 = Float.parseFloat(textfield.getText());
                    operator = '/';

                    if(num1%1==0){
                        int tempNum1 = (int) num1;
                        label.setText(String.valueOf(tempNum1) + String.valueOf(operator));
                    }
                    else{
                        label.setText(String.valueOf(num1) + String.valueOf(operator));
                    }

                    textfield.setText("0");
                }
                else if(tempEquals==true){
                    tempEquals=false;
                    num1 = Float.parseFloat(textfield.getText());
                    operator = '/';

                    if(num1%1==0){
                        int tempNum1 = (int) num1;
                        label.setText(String.valueOf(tempNum1) + String.valueOf(operator));
                    }
                    else{
                        label.setText(String.valueOf(num1) + String.valueOf(operator));
                    }

                    textfield.setText("0");
                }
                else{
                    num1 /= Float.parseFloat(textfield.getText());
                    operator = '/';

                    if(num1%1==0){
                        int tempNum1 = (int) num1;
                        label.setText(String.valueOf(tempNum1) + String.valueOf(operator));
                    }
                    else{
                        label.setText(String.valueOf(num1) + String.valueOf(operator));
                    }

                    textfield.setText("0");    
                }
            }
        });
        
        frame.setVisible(true);
        frame.setResizable(false);
    }
    
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
    }
    
}
