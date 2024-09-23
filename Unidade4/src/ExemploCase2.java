public class ExemploCase2 {
    public static void main(String[] args) {
        char resposta = 'X'; // A, B, C, D, E

        if (resposta == 'A') {
            System.out.println("Respondeu A");
        } else {
            if (resposta == 'B') {
                System.out.println("Respondeu B");
                System.out.println("O B é legal");
            } else {
                if (resposta == 'C') {
                    System.out.println("Respondeu C");
                } else {
                    if (resposta == 'D') {
                        System.out.println("Respondeu D");
                    } else {
                        if (resposta == 'E') {
                            System.out.println("Respondeu E");
                        } else {
                            System.out.println("Resposta Inválida");
                        }
                    }
                }
            }
        }

        if (resposta == 'A') {
            System.out.println("Respondeu A");
        } else if (resposta == 'B') {
            System.out.println("Respondeu B");
            System.out.println("O B é legal");
        } else if (resposta == 'C') {
            System.out.println("Respondeu C");
        } else if (resposta == 'D') {
            System.out.println("Respondeu D");
        } else if (resposta == 'E') {
            System.out.println("Respondeu E");
        } else {
            System.out.println("Resposta Inválida");
        }

        switch (resposta) {
            case 'A':
                System.out.println("Respondeu A");
                break;
            case 'B':
                System.out.println("Respondeu B");
                break;
            case 'C':
                System.out.println("Respondeu C");
                break;
            case 'D':
                System.out.println("Respondeu D");
                break;
            case 'E':
                System.out.println("Respondeu E");
                break;
            default:
                System.out.println("Resposta Inválida");
                break;
        }
    }
}
