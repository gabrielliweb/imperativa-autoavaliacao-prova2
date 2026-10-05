import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] a = {3, 5, 3};
        int[] b = {5, 8};
        int[] u = new int[a.length + b.length];
        int tamU = uniao(a, a.length, b, b.length, u);
        System.out.println("uniao: " + Arrays.toString(Arrays.copyOf(u, tamU)) + " (tam=" + tamU + ")");

        int[] v1 = {5, 2, 8, 1};
        ordenar(v1, v1.length);
        System.out.println("ordenar: " + Arrays.toString(v1));

        int[] v2 = {5, 2, 5, 3, 3, 8, 3, 8, 2};
        int[] vsr = new int[v2.length];
        int tamVsr = gerarVetorSemRepeticao(v2, v2.length, vsr);
        System.out.println("semRepeticao: " + Arrays.toString(Arrays.copyOf(vsr, tamVsr)) + " (tam=" + tamVsr + ")");

        int[] v3 = {1, 2, 3, 4, 5};
        rotacionar(v3, v3.length, 2);
        System.out.println("rotacionar k=2: " + Arrays.toString(v3));

        int[] v4 = {1, 2, 3, 4, 5};
        rotacionar(v4, v4.length, -1);
        System.out.println("rotacionar k=-1: " + Arrays.toString(v4));
    }

    public static boolean existeNoVetor(int[] u, int tamU, int valor) {
        for (int i = 0; i < tamU; i += 1) {
            if (u[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public static int uniao(int[] a, int tamA, int[] b, int tamB, int[] u) {
        int tamU = 0;
        for (int i = 0; i < tamA; i += 1) {
            if (!existeNoVetor(u, tamU, a[i])) {
                u[tamU++] = a[i];
            }
        }
        for (int i = 0; i < tamB; i += 1) {
            if (!existeNoVetor(u, tamU, b[i])) {
                u[tamU++] = b[i];
            }
        }
        return tamU;
    }

    public static void ordenar(int[] v, int n) {
        for (int i = 0; i < n; i++) {
            int chave = v[i];
            int j = i - 1;
            while (j >= 0 && v[j] > chave) {
                v[j + 1] = v[j];
                j -= 1;
            }
            v[j + 1] = chave;
        }
    }

    public static int gerarVetorSemRepeticao(int[] v, int tamV, int[] vsr) {
        int tamVsr = 0;
        for (int i = 0; i < tamV; i += 1) {
            if (!existeNoVetor(vsr, tamVsr, v[i])) {
                vsr[tamVsr] = v[i];
                tamVsr += 1;
            }
        }
        return tamVsr;
    }

    public static void rotacionar(int[] v, int tam, int k) {
        if (k < 0) {
            k = tam + k;
        }
        for (int j = 0; j < k; j += 1) {
            int primeiro = v[0];
            for (int i = 0; i < tam - 1; i += 1) {
                v[i] = v[i + 1];
            }
            v[tam - 1] = primeiro;
        }
    }
}