import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String [] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPhabliny = new Dev();
        devPhabliny.setNome("Phabliny");
        devPhabliny.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Phabliny:" +devPhabliny.getConteudosInscritos());
        devPhabliny.progredir();
        System.out.println("*-*");
        System.out.println("Conteúdos Inscritos Phabliny:" +devPhabliny.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Phabliny:" +devPhabliny.getConteudosConcluidos());
        System.out.println("XP: " + devPhabliny.calcularTotalXp());

        System.out.println("---------------------------");

        Dev devSophia = new Dev();
        devSophia.setNome("Sophia");
        devSophia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Sophia:" +devSophia.getConteudosInscritos());
        devSophia.progredir();
        devSophia.progredir();
        devSophia.progredir();
        System.out.println("*-*");
        System.out.println("Conteúdos Inscritos Sophia:" +devSophia.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Sophia:" +devSophia.getConteudosConcluidos());
        System.out.println("XP: " + devSophia.calcularTotalXp());
    }
}
