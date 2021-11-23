//package Streams;
//
//import java.util.Comparator;
//import java.util.List;
//
//public class Stream {
//    public static void show(){
//
////        Streams processes data in a declarative way
//        List<Movie> movies = List.of(
//                new Movie("a",10),
//                new Movie("cc",50),
//                new Movie("bb",80),
//                new Movie("d",60)
//        );
//
//        var moreLikes = movies.stream().filter(movie -> movie.getLikes() > 10).count();
//        System.out.println(moreLikes);
//
//
//       movies.stream().map(movie -> movie.getName()).forEach(name -> System.out.println(name));
//
//        movies.stream().map(movie -> movie.getName()).forEach(name -> System.out.println(name));
//
//        movies.stream().sorted(Comparator.comparing(Movie::getName)).forEach(m-> System.out.println(m.getName()));
//
//        movies.stream().map(Movie::getLikes).distinct().forEach(m-> System.out.println(m ));
//    }
//}
