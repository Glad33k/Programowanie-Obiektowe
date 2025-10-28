package zad4;

import java.util.Arrays;
import java.util.Objects;

public class Results {
    private String firstName;
    private String lastName;
    private int[] results;


    public Results(String firstName, String lastname, int size) {
        this.firstName = firstName;
        this.lastName = lastname;
        this.results = new int[size];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int[] getResults() {
        return results;
    }

    public void setResults(int[] results) {
        this.results = results;
    }

    public void addResult(int index, int result) {
        if (index >= 0 && index < results.length) {
            results[index] = result;
        } else {
            throw new IllegalArgumentException("Nieprawidłowy index: " + index);
        }
    }

    public double averageResult() {
        if (results.length == 0) return 0.0;
        int sum = 0;
        for (int r : results) {
            sum += r;
        }
        return (double) sum / results.length;
    }

    @Override
    public String toString() {
        return "Results for " + firstName + " " + lastName + ": Average Score = " + averageResult() + ", Results: " + Arrays.toString(results);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Results)) return false;

        Results other = (Results) obj;
        return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName) && Arrays.equals(results, other.results);

    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, lastName);
        result = 31 * result + Arrays.hashCode(results);
        return result;
    }

    public static void main() {

        Results r1 = new Results("Jan", "Kowalski", 3);
        r1.addResult(0, 80);
        r1.addResult(1, 90);
        r1.addResult(2, 70);

        Results r2 = new Results("Jan", "Kowalski", 3);
        r2.setResults(new int[]{80, 90, 70});

        System.out.println(r1);
        System.out.println("Czy r1 == r2? " + r1.equals(r2));
        System.out.println("Hash r1: " + r1.hashCode());
        System.out.println("Hash r2: " + r2.hashCode());

    }
}

