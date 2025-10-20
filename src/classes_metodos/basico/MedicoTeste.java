package classes_metodos.basico;

public class MedicoTeste {
    public static void main(String[] args) {

        Medico plantonista1 = new Medico();
        plantonista1.id = 1834;
        plantonista1.nome = "Nicholas";
        plantonista1.crm = "12345";
        plantonista1.salario = 60_000;

        System.out.println(plantonista1.id);
        System.out.println(plantonista1.nome);
        System.out.println(plantonista1.crm);
        System.out.println(plantonista1.salario);

        Medico plantonista2 = new Medico();
        plantonista2.id = 23456;
        plantonista2.nome = "Jessica";
        plantonista2.crm = "12345";
        plantonista2.salario = 50_000;

        System.out.printf("O(A) médico(a) plantonista %s tem CRM %s. ", plantonista2.nome, plantonista2.crm);


    }
}
