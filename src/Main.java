import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso1 = new Curso();
      curso1.setTitulo("Java");
      curso1.setDescricao("Descrição curso Java");
      curso1.setCargaHoraria(8);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria apenas de java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);


        Dev devIrvson = new Dev();
        devIrvson.setNome("Irvson");
        devIrvson.inscreverBootcamp(bootcamp);
      System.out.println("Conteudos Inscritos"+devIrvson.getconteudosInscritos());
        devIrvson.progredir();
      System.out.println("Conteudos Inscritos"+devIrvson.getconteudosInscritos());
        System.out.println("Conteudos Concluidos"+devIrvson.getConteudosConcluidos());

      Dev devDiane = new Dev();
      devDiane.setNome("Irvson");
      devDiane.inscreverBootcamp(bootcamp);
      System.out.println("Conteudos Inscritos"+devIrvson.getconteudosInscritos());
      devDiane.progredir();
      System.out.println("Conteudos Inscritos"+devDiane.getconteudosInscritos());
      System.out.println("Conteudos Concluidos"+devDiane.getConteudosConcluidos());
    }
}