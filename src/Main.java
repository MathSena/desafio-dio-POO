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



        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);



    }
}
