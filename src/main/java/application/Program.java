package application;

import model.entities.CarRental;
import model.entities.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        input.nextLine();
        String carModel = input.nextLine();
        System.out.print("Retirada: ");
        LocalDateTime start = LocalDateTime.parse(input.nextLine(), fmt);
        System.out.print("Retorno: ");
        LocalDateTime finish = LocalDateTime.parse(input.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        input.close();
    }

}
