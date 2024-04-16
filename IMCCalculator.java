import java.util.Scanner;

public class IMCCalculator {
    public static void main(String[] args) {

        //Variables
        double personWeight;
        double personHeight;
        double imcResult;

        //User reading
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        personWeight = keyboard.nextDouble();

        System.out.println("Digite a sua altura em metros (Ex.: 1,60): ");
        personHeight = keyboard.nextDouble();

        //Calculation
        imcResult = (personWeight) / (personHeight * personHeight);

        //Result shown to the user
        if (imcResult <= 18.5){
            System.out.printf("Seu IMC é de %.2f kg/m² e você está com Baixo Peso", imcResult);
        } else if (imcResult <= 24.99){
            System.out.printf("Seu IMC é de %.2f kg/m² e você está no peso Normal.", imcResult);
        } else if (imcResult <= 29.99) {
            System.out.printf("Seu IMC é de %.2f kg/m² e você está com Sobrepeso.", imcResult);
        } else if (imcResult <= 34.99) {
            System.out.printf("Seu IMC é de %.2f kg/m² e você está com Obesidade Grau I.", imcResult);
        } else if (imcResult <= 39.99) {
            System.out.printf("Seu IMC é de %.2f kg/m² e você está com Obesidade Grau II.", imcResult);
        } else if (imcResult >= 40) {
            System.out.printf("Seu IMC é de %.2f kg/m² e você está com Obesidade Mórbida.", imcResult);
        }

        System.out.println("\nMantenha-se ativo, pela sua Saúde! Procure um nutricionista.");
    }
}