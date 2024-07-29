import Desafio.Bootcamp;
import Desafio.Curso;
import Desafio.Dev;
import Desafio.Mentoria;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev usuario1 = new Dev();
        usuario1.setNome("Camila");
        usuario1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + usuario1.getConteudosInscritos());
        usuario1.progredir();
        usuario1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + usuario1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + usuario1.getConteudosConcluidos());
        System.out.println("XP:" + usuario1.calcularTotalXp());

        System.out.println("-------");

        Dev usuario2 = new Dev();
        usuario2.setNome("Joao");
        usuario2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + usuario2.getConteudosInscritos());
        usuario2.progredir();
        usuario2.progredir();
        usuario2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + usuario2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + usuario2.getConteudosConcluidos());
        System.out.println("XP:" + usuario2.calcularTotalXp());

    }

}