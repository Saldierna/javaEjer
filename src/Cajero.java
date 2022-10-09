import javax.swing.JOptionPane;


public class Cajero {
    public double saldo;

    private static String contra_usuario;
    private static String contrasena = "1235";

    public static String menu = "¿Que deseas realizar?\n\n" +
            "    1.- Realizar un retiro.\n" +
            "    2.- Revisar saldo.\n" +
            "    3.- Ultimo Movimiento CAMBIO DESDE DEVELOP A QA Y LUEGO A MASTER\n" +
            "    4.- Salirrrr.\n";


    public Cajero() {
        saldo = 1000;
    }


    public Cajero(double saldo) {
        this.saldo = saldo;
    }


    static boolean pedirNip() {
        contra_usuario = JOptionPane.showInputDialog(
                null,
                "De su nip de 4 digitos:"
        );
        if (contra_usuario.equals(contrasena)) {
            return (true);
        } else {
            return (false);
        }
    }

    public void movimiento() {

        JOptionPane.showMessageDialog(null, "---------------" +
                "Tu ultimo mov es: $" + saldo);
    }

    public void realizarRetiro() {
        double retiro = Double.parseDouble(
                JOptionPane.showInputDialog(
                        null,
                        "¿Cuanto deseas retirar?"
                )
        );
        if ((saldo - retiro) >= 0) {
            saldo -= retiro;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
        }
    }


    public void mostrarSaldo() {
        JOptionPane.showMessageDialog(null, "El saldo actual es: $" + saldo);
    }


    public static void main(String[] args) {
        while (true) {
            String opcion_1 = JOptionPane.showInputDialog(
                    null,
                    "Bienvenido al Banco Saldierna!\n\n" +
                            "¿Quiere ver el Menú princpal?\n" +
                            "si\n" +
                            "no"
            );

            if (opcion_1.equals("si")) {
                if (pedirNip() == true) {
                    if (pedirNip() == true) {
                        if (pedirNip() == true) {
                            Cajero cajero = new Cajero();


                            int opcion_2 = Integer.parseInt(
                                    JOptionPane.showInputDialog(
                                            null,
                                            menu
                                    )
                            );

                            switch (opcion_2) {
                                case 3:
                                    cajero.movimiento();
                                    cajero.mostrarSaldo();
                                    break;

                                case 1:
                                    cajero.realizarRetiro();
                                    cajero.mostrarSaldo();
                                    break;

                                case 2:
                                    cajero.mostrarSaldo();
                                    break;

                                case 4:
                                    JOptionPane.showMessageDialog(
                                            null,
                                            "Gracias por hacer uso del cajero."
                                    );
                                    System.exit(0);
                                    break;

                                default:
                                    JOptionPane.showMessageDialog(
                                            null,
                                            "Opcion incorrecta, " +
                                                    "intentelo de nuevo."
                                    );
                                    break;
                            }

                        } else {
                            JOptionPane.showMessageDialog(
                                    null,
                                    "Su nip es incorrecto."
                            );
                        }

                    } else if (opcion_1.equals("no")) {
                        break;

                    }
                }
            }
        }
    }
}