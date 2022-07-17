package Agenda;

import java.util.HashSet;
import java.util.Scanner;

public class Agenda {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		HashSet<Cliente> client = new HashSet<>();
		
		int controleLoopMenu = 0;
		int escolha;
		
		while(controleLoopMenu == 0) {
			
			System.out.println("Sistema de agendamento               |");
			System.out.println("------------------------------------ |");
			System.out.println("Escolha uma opcao                    |");
			System.out.println("1. Consultar a agenda                |");
			System.out.println("2. Agendar um atendimento            |");
			System.out.println("3. Remover um agendamento            |");
			System.out.println("------------------------------------ |");
			escolha = entrada.nextInt();
			
			switch(escolha) {
				case 1:
					controleLoopMenu = 1;
					
					//O módulo de consulta será implementado aqui
					
					//Módulo de retorno ao menu
					System.out.println("Consultar agenda...");
					
					System.out.println("Processo encerrado");
					int escolhaSair1;
					
					System.out.println("Deseja retornar ao menu?");
					System.out.println("1 - Sim/2 - Nao");
					escolhaSair1 = entrada.nextInt();
					
					if(escolhaSair1 == 1) {
						System.out.println("Retornando ao menu...");
						controleLoopMenu = 0;
					}else if(escolhaSair1 == 2) {
						System.out.println("Encerrando o sistema...");
					}
				break;
				case 2:
					//Módulo de agendamento
					int userEscolha;
					String clientTime = null;
					
					int userEscolhaService;
					String clientService = null;
					
					String clientName;
					String clientEmail;
					String clientPhone;
					
					int escolhaSair2;
					
					
					System.out.println("Sistema de agendamento               |");
					System.out.println("------------------------------------ |");
					System.out.println("Horarios disponiveis:                |");
					System.out.println("------------------------------------ |");
					System.out.println("1. 08:00 - 09:00                     |");
					System.out.println("2. 09:00 - 10:00                     |");
					System.out.println("3. 10:00 - 11:00                     |");
					System.out.println("4. 11:00 - 12:00                     |");
					System.out.println("------------------------------------ |");
					System.out.println("Informe o num. do horario desejado:  |");
					System.out.println("------------------------------------ |");
					userEscolha = entrada.nextInt();
					
						switch(userEscolha) {
							case 1: 
								clientTime = "08:00 - 09:00";
							break;
							case 2: 
								clientTime = "09:00 - 10:00";
							break;
							case 3: 
								clientTime = "10:00 - 11:00";
							break;
							case 4: 
								clientTime = "11:00 - 12:00";
							break;
						}
					
					System.out.println("------------------------------------ |");
					System.out.println("Como devemos te chamar?              |");
					clientName = entrada.next();
					
					System.out.println("------------------------------------ |");
					System.out.println("Qual o seu email?                    |");
					clientEmail = entrada.next();
					
					System.out.println("------------------------------------ |");
					System.out.println("Qual o seu telefone?                 |");
					clientPhone = entrada.next();
					
					System.out.println("------------------------------------ |");
					System.out.println("Escolha o atendimento desejado       |");
					System.out.println("1. Atendimento A                     |");
					System.out.println("2. Atendimento B                     |");
					System.out.println("3. Atendimento C                     |");
					System.out.println("4. Atendimento D                     |");
					userEscolhaService = entrada.nextInt();
					
						switch(userEscolhaService) {
							case 1:
								clientService = "Atendimento A";
							break;
							case 2:
								clientService = "Atendimento B";
							break;
							case 3:
								clientService = "Atendimento C";
							break;
							case 4:
								clientService = "Atendimento D";
							break;
						}
					
					System.out.println("------------------------------------ |");
					client.add(new Cliente(clientTime, clientName,clientEmail, clientPhone, clientService));
					System.out.println("Atendimento agendado!");	
					System.out.println("------------------------------------ |");
					System.out.println("Resumo: ");
					for(Cliente c: client) {
						System.out.println(c.horario);
						System.out.println(c.nome);
						System.out.println(c.email);
						System.out.println(c.telefone);
						System.out.println(c.servico);
					}
					System.out.println("------------------------------------ |");
					
					//Módulo para retorno ao menu
					System.out.println("Processo encerrado");
					System.out.println("Deseja retornar ao menu?");
					System.out.println("1 - Sim/2 - Nao");
					escolhaSair2 = entrada.nextInt();
					
					if(escolhaSair2 == 1) {
						System.out.println("Retornando ao menu...");
						controleLoopMenu = 0;
					}else if(escolhaSair2 == 2) {
						System.out.println("Encerrando o sistema...");
						controleLoopMenu = 1;
					}
				break;
				case 3:
					int escolhaSair3;
					
					System.out.println("Remover um agendamento...");
					
					//O módulo de remoção de atendimento será implementado aqui
					
					//Módulo para retorno ao menu
					System.out.println("Processo encerrado");
					
					System.out.println("Deseja retornar ao menu?");
					System.out.println("1 - Sim/2 - Nao");
					escolhaSair3 = entrada.nextInt();
					
					if(escolhaSair3 == 1) {
						System.out.println("Retornando ao menu...");
						controleLoopMenu = 0;
					}else if(escolhaSair3 == 2) {
						System.out.println("Encerrando o sistema...");
						controleLoopMenu = 1;
					}
				break;
			}
		}

		entrada.close();
	}
}