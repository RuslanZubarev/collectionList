package practice;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(ADD|LIST|EDIT|DELETE)\\s*([0-9]*)(.+)*");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Matcher matcher = pattern.matcher(scanner.nextLine());
            if (!matcher.matches()) {
                System.out.println("Неверный формат команды");
                continue;
            }
            String cmd = matcher.group(1);
            int index;
            if (!matcher.group(2).isBlank()) {
                index = Integer.parseInt(matcher.group(2));
            } else {
                index = 0;
            }
            String text = matcher.group(3);
            System.out.println("Command: " + cmd + ", index: " + index + ", text: " + text);

            if (cmd.equals("ADD")) {
                if (index > 0) {
                    todoList.add(index, text);
                } else todoList.add(text);
            }
            if (cmd.equals("EDIT")) {
                if (index >= 0) {
                    todoList.edit(index, text);
                }
            }
            if (cmd.equals("DELETE")) {
                if (index >= 0) {
                    todoList.delete(index);
                }
            }
            if (cmd.equals("LIST")) {
                System.out.println(todoList.getTodos());
            }
        }
    }
    // TODO: написать консольное приложение для работы со списком дел todoList
}
