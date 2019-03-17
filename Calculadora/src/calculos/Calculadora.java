package calculos;

import java.awt.Container;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import calculos.FuncoesMath;

public class Calculadora extends JFrame {

	    //TELA
		JTextField txtresult = new JTextField("0");
		
		//BOTÕES AUXILIARES  
		JButton btnExibir = new JButton("Exibir ");
		JButton btnEditar = new JButton("Editar ");
		JButton btnAjuda = new JButton("Ajuda ");
		
		//NÚMEROS
		JButton btn0 = new JButton("0");
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		
		//FUNÇÕES MATEMÁTICAS 
		
		JButton btnRaiz = new JButton("Raiz");
		JButton btnPorcentagem = new JButton("%");
		JButton btnPotencia = new JButton("%");
		JButton btnMaisMenos = new JButton("±");
		JButton btnFracao = new JButton("1/x");
		
		
		
		JButton btnSubtracao = new JButton("-");
		JButton btnDivisao = new JButton("/");
		JButton btnMultiplicacao = new JButton("*");
		JButton btnSoma= new JButton("+");
		
		
		//BOTÕES M's
		JButton btnMC = new JButton("MC");
		JButton btnMR = new JButton("MR");
		JButton btnMS = new JButton("MS");
		JButton btnMmais = new JButton("M+");
		JButton btnMmenos = new JButton("M-");
	
		//BOTÕES PARA APAGAR 
		JButton btnApagar = new JButton("<-");
		JButton btnCE = new JButton("CE");
		JButton btnC = new JButton("C");
		
		JButton btnPonto = new JButton(".");
		JButton btnIgual = new JButton("=");
		
		
		FuncoesMath mat = new FuncoesMath();
		String sinal= null;
		double num1 = 0, num2 = 0 ;
		

		public Calculadora () {
			super ("Calculadora"); // COMANDO SUPER UTILIZADO PARA ESCREVER O NOME DA JANELA 
			Container paine = this.getContentPane(); 
			paine.setLayout(null);
			
			// TELA DE TEXTO
			paine.add(txtresult);
			txtresult.setBounds(10 , 32 , 320, 50);
			
			// NUMEROS 
			
			paine.add(btn0);
			btn0.setBounds(10 ,305 , 125, 40); // (COLUNA , LINHA ,ESPACO ,ALTURA  )
			btn0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(txtresult.getText().equals("0")) {
						txtresult.setText("0");
					}else {
						txtresult.setText(txtresult.getText() + "0");
					}
					
					
				}
			});
			paine.add(btn1);
			btn1.setBounds(10 ,260 , 60, 40);
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(txtresult.getText().equals("0")) { // PARA ADICIONAR O NÚMERO 
						txtresult.setText("1");
					}else {
						txtresult.setText(txtresult.getText() + "1"); // PARA ADICIONAR O NÚMERO CASO JÁ TENHA ALGUM OUTRO VALOR 
					}
					
					
				}
			});
			paine.add(btn2);
			btn2.setBounds(75 ,260, 60, 40);
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(txtresult.getText().equals("0")) {
						txtresult.setText("2");
					}else {
						txtresult.setText(txtresult.getText() + "2");
					}
					
					
				}
			});
			paine.add(btn3);
			btn3.setBounds(140 ,260 , 60, 40);
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(txtresult.getText().equals("0")) {
						txtresult.setText("3");
					}else {
						txtresult.setText(txtresult.getText() + "3");
					}
					
					
				}
			});
			
			paine.add(btn4);
			btn4.setBounds(10 ,215 , 60, 40);
			btn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(txtresult.getText().equals("0")) {
						txtresult.setText("4");
					}else {
						txtresult.setText(txtresult.getText() + "4");
					}
					
					
				}
			});
			
			paine.add(btn5);
			btn5.setBounds(75 ,215, 60, 40);
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(txtresult.getText().equals("0")) {
						txtresult.setText("5");
					}else {
						txtresult.setText(txtresult.getText() + "5");
					}
					
					
				}
			});
			
			paine.add(btn6);
			btn6.setBounds(140 ,215, 60, 40);
			btn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(txtresult.getText().equals("0")) {
						txtresult.setText("6");
					}else {
						txtresult.setText(txtresult.getText() + "6");
					}
					
					
				}
			});

			paine.add(btn7);
			btn7.setBounds(10 ,170 , 60, 40);
			btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(txtresult.getText().equals("0")) {  // PARA ADICIONAR O 7
						txtresult.setText("7");
					}else {
						txtresult.setText(txtresult.getText() + "7"); // PARA ADICIONAR O 7 CASO JÁ TENHA O NÚMERO 
					}
					
					
				}
			});
			
			paine.add(btn8);
			btn8.setBounds(75 ,170, 60, 40);
			btn8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(txtresult.getText().equals("0")) {
						txtresult.setText("8");
					}else {
						txtresult.setText(txtresult.getText() + "8");
					}
					
					
				}
			});
			
			paine.add(btn9);
			btn9.setBounds(140 ,170 , 60, 40);
			btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(txtresult.getText().equals("0")) {
						txtresult.setText("9");
					}else {
						txtresult.setText(txtresult.getText() + "9");
					}
					
					
				}
			});
		
			// PAINEL DE BOTÕES AUXILIARES 
			paine.add(btnExibir);
			btnExibir.setBounds(10, 2, 100, 30);
			
			paine.add(btnEditar);
			btnEditar.setBounds(120, 2, 100, 30);
			
			paine.add(btnAjuda);
			btnAjuda.setBounds(230,2,100,30);
		
			// FUNCOES MATEMATICAS
			paine.add(btnRaiz);
			btnRaiz.setBounds(270 ,125 , 60, 40);
			
			paine.add(btnMaisMenos);
			btnMaisMenos.setBounds(205,125 , 60, 40);
			
			paine.add(btnPorcentagem);
			btnPorcentagem.setBounds(270 ,170 , 60, 40);
			
			paine.add(btnFracao);
			btnFracao.setBounds(270 ,215 , 60, 40);
			
			
			
			paine.add(btnDivisao);// BOTÃO DIVISÃO 
			btnDivisao.setBounds(205 ,170 , 60, 40);
			btnDivisao.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num1 = Double.parseDouble(txtresult.getText());
					sinal = "Divisão";
					txtresult.setText("0");
				}
			});
			
			paine.add(btnMultiplicacao);// BOTÃO MULTIPLICAÇÃO 
			btnMultiplicacao.setBounds(205 ,215 , 60, 40);
			btnMultiplicacao.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num1 = Double.parseDouble(txtresult.getText());
					sinal = "Multiplicacão";
					txtresult.setText("0");
				}
			});
			
			paine.add(btnSubtracao); // BOTÃO SUBTRAÇÃO
			btnSubtracao.setBounds(205 ,260 , 60, 40);
			btnSubtracao.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num1 = Double.parseDouble(txtresult.getText());
					sinal = "Subtração";
					txtresult.setText("0");
				}
			});
			
			paine.add(btnSoma); //BOTÃO SOMA 
			btnSoma.setBounds(205 ,305 , 60, 40);
			btnSoma.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num1 = Double.parseDouble(txtresult.getText());
					sinal = "Soma";
					txtresult.setText("0");
				}
			});
		
			// BOTÕES M's
			paine.add(btnMC);
			btnMC.setBounds(10 ,80 , 60, 40); // (COLUNA , LINHA ,ESPACO ,ALTURA  )
			btnMC.setMargin(new Insets(1,1,1,1) ); //MARGEM DO BOTÃO 
			
			paine.add(btnMR);
			btnMR.setBounds(75 ,80 , 60, 40);
			btnMR.setMargin(new Insets(1,1,1,1) );
			
			paine.add(btnMS);
			btnMS.setBounds(140 ,80 , 60, 40);
			btnMS.setMargin(new Insets(1,1,1,1) );
			
			paine.add(btnMmenos);
			btnMmenos.setBounds(205 ,80 , 60, 40);
			
			paine.add(btnMmais);
			btnMmais.setBounds(270 ,80 , 60, 40);
			

			// BOTÕES APAGAR
			paine.add(btnApagar);
			btnApagar.setBounds(10, 125, 60, 40);
			
			paine.add(btnCE);
			btnCE.setBounds(75, 125, 60, 40);
			btnCE.addActionListener(new ActionListener() {   // EXECUÇÃO DO BOTÃO 
				public void actionPerformed(ActionEvent e) {

					txtresult.setText("0");
					
				}
			});
			
			paine.add(btnC);
			btnC.setBounds(140 ,125 , 60, 40);
			btnC.addActionListener(new ActionListener() {  
				public void actionPerformed(ActionEvent e) {

					txtresult.setText("0");
					
				}
			});

			// BOTÃO PONTO
			paine.add(btnPonto);
			btnPonto.setBounds(140 ,305, 60, 40);
			btnPonto.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(txtresult.getText().equals(".")) {
						txtresult.setText(".");
					}else {
						txtresult.setText(txtresult.getText() + ".");
					}
					
					
				}
			});

			// BOTÃO IGUAL

			paine.add(btnIgual);
			btnIgual.setBounds(270 ,260 , 60, 85);
			btnIgual.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					num2 = Double.parseDouble(txtresult.getText());

					if(sinal.equals("Soma")) {
						txtresult.setText(mat.soma(num1, num2) + "");
					}
					else if (sinal.equals("Subtração")) {
						txtresult.setText(mat.subtracao(num1, num2) + "");
					}
					else if (sinal.equals("Multiplicação")) {
						txtresult.setText(mat.multiplicacao(num1, num2) + "");				
					}
					else if (sinal.equals("Divisão")) {
						txtresult.setText(mat.divisao(num1, num2) + "");					
					}
					
				}
			});

			
			this.setSize(350, 400); // TAMANHO DA TELA
			this.setVisible(true); // VISUALIZAÇÃO DA TELA 
			this.setResizable(false);// NÃO PERMITE ALTEÇÃO NO TAMANHO DA TELA 
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// COMANDO PARA ENCERRAR A JANELA 
			
		}
		public static void main(String[]args) {
			Calculadora calc = new Calculadora();
		}

	}


