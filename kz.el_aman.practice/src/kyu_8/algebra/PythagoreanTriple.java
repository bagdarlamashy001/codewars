package kyu_8.algebra;

/*
* Pythagorean Triple - Пифагор үштігі
* Тапсырмаға сілтеме: https://www.codewars.com/kata/5951d30ce99cf2467e000013
*
* Менің өз ойым  тапсырмада басқаша жазылған
*
* Тапсырма: Пифагор үштігі екенің дәлелдеу керек.
* Менің түсінгенім Пифагор үштігі деген:
* Кез келген екі дәрежелі үш саннаң тұратын тікбұрышты үшбұрыш екен
* Нақтырақ айтсақ
* Кезкелген екі дәрежелі үш сандардын екеуін бір-біріне қосқанда үшінші санға тең болса онда ол Пифагор үштігі болады екен
*
* Мысалы:
*
*          [3, 4, 5] сандары бар делік
*
*           3 * 3 = 9
*                   +
*           4 * 4 = 16 = 25 == 25 = 5 * 5
*
*        Формуласы:  a * a + b * b = c * c
*/
public class PythagoreanTriple {

    // Java тілінде шешімі
    // Пифагор үштігі болса онда 1 қайтарады ал болмаса 0 қайтарады
    public int pythagoreanTriple(int[] triple){
        return Math.pow(triple[0], 2) + Math.pow(triple[1], 2) == Math.pow(triple[2], 2) ||
                Math.pow(triple[0], 2) + Math.pow(triple[2], 2) == Math.pow(triple[1], 2) ||
                Math.pow(triple[1], 2) + Math.pow(triple[2], 2) == Math.pow(triple[0], 2) ? 1 : 0;
    }

    public static void main(String[] args) {
        // Пифагор үштігі
        int triple[] = {10, 8, 6};
        // Пифагор үштігі емес
        int[] nonTriple = {11, 8, 6};

        PythagoreanTriple pythagoreanTriple = new PythagoreanTriple();

        System.out.println(pythagoreanTriple.pythagoreanTriple(triple) + " Пифагор үштігі");
        System.out.print(pythagoreanTriple.pythagoreanTriple(nonTriple) + " Пифагор үштігі емес");
    }
}
