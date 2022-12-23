import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso de js");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        System.out.println("\n----\n");
        System.out.println("Conteúdos Inscritos" + devMarcos.getConteudosInscritos());
        System.out.println("\nConteúdos Concluidos" + devMarcos.getConteudosConcluidos());
        System.out.println("\nXP: " + devMarcos.calcularTotalXp());
        devMarcos.progredir();
        System.out.println("\n----\n");
        System.out.println("Conteúdos Inscritos" + devMarcos.getConteudosInscritos());
        System.out.println("\nConteúdos Concluidos" + devMarcos.getConteudosConcluidos());
        System.out.println("\nXP: " + devMarcos.calcularTotalXp());
    }
}
