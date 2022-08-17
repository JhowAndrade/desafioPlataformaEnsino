package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Lesson> list = new ArrayList<>();

		System.out.print("Quantas aulas tem o curso? ");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println("Dados da " + i + "a aula: ");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char type = sc.next().charAt(0);
			System.out.print("Titulo: ");
			sc.nextLine();
			String title = sc.next();
			System.out.print("URL do vídeo: ");
			String url = sc.next();

			if (type == 'c') {
				System.out.print("Duração em segundos: ");
				int seconds = sc.nextInt();
				System.out.println();
				list.add(new Video(title, url, seconds));

			} else {
				System.out.print("Quantidade de questões: ");
				int questionCount = sc.nextInt();
				System.out.println();
				list.add(new Task(title, url, questionCount));
			}
		}
		
		int sum = 0;
		for(Lesson ls : list) {
			sum += ls.duration();
		}
		
		System.out.println();
		System.out.println("DURAÇÃO TOTAL DO CURSO = " + sum + " segundos");

		sc.close();

	}

}
