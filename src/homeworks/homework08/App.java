package homeworks.homework08;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        List<Product> products = new ArrayList<>();
        String inputPath = "C:\\Users\\teach\\IdeaProjects\\Homework\\HomeworkProject\\Data.txt";
        try (BufferedReader in = new BufferedReader(new FileReader(inputPath))) {
            int counter = 1;
            String line = in.readLine();
            while (!line.equals("END")) {
                if (counter == 1) {
                    String[] words = line.split("; ");
                    for (String s : words) {
                        Person person = new Person();
                        String[] word = s.split(" = ");
                        for (int j = 0; j < word.length; j++) {
                            if (j == 0) {
                                person.setPersonName(word[j]);
                            } else {
                                person.setAmountMoney(Integer.parseInt(word[j]));
                            }
                        }
                        persons.add(person);
                    }
                }
                if (counter == 2) {
                    String[] words = line.split("; ");
                    for (String s : words) {
                        Product product = new Product();
                        String[] word = s.split(" = ");
                        for (int j = 0; j < word.length; j++) {
                            if (j == 0) {
                                product.setProductName(word[j]);
                            } else {
                                product.setProductPrice(Integer.parseInt(word[j]));
                            }
                        }
                        products.add(product);
                    }
                }
                if (counter > 2) {
                    for (Person person : persons) {
                        if (line.contains(person.getPersonName())) {
                            for (Product product : products) {
                                if (line.contains(product.getProductName())) {
                                    person.addShoppingCart(product);
                                }
                            }
                        }
                    }
                }
                counter++;
                line = in.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Person person : persons) {
            person.getShoppingCart();
        }
    }
}
