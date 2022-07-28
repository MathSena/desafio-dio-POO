import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {



        Curso curso1 = new Curso();
        curso1.setTitulo("Spring");
        curso1.setDescricao("Curso sobre Spring Boot");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Javascript");
        curso2.setDescricao("Curso sobre JS");
        curso2.setCargaHoraria(15);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria sobre Java");
        mentoria1.setData(LocalDate.now());


        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Java Developer");
        bootcamp1.setDescricao("Bootcamp sobre Java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp1);
        devMatheus.progedir();
        devMatheus.progedir();

        Dev devRoberta = new Dev();
        devRoberta.setNome("Roberta");
        devRoberta.inscreverBootcamp(bootcamp1);
        devRoberta.progedir();


        System.out.println("Matheus" + devMatheus.getConteudoInscritos());
        System.out.println("Matheus" + devMatheus.getConteudoConcluidos());
        System.out.println("XP: " + devMatheus.calcularTotal());
        System.out.println("Roberta" + devRoberta.getConteudoInscritos());
        System.out.println("Roberta" + devRoberta.getConteudoConcluidos());
        System.out.println("XP: " + devRoberta.calcularTotal());



        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria1);



    }
}
