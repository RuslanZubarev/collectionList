package practice;

import java.util.ArrayList;

public class TodoList {
    private final ArrayList<String> toDo = new ArrayList<>();

    public void add(String todo) {
        toDo.add(todo);
        System.out.println("Добавлено дело: ".concat(todo));
        // TODO: добавьте переданное дело в конец списка
    }

    public void add(int index, String todo) {
        if (index >= 0 && index <= toDo.size()) {

            toDo.add(index, todo);
            System.out.println("Дело " + toDo.get(index) + " добавлено в индекс " + index);
        } else if (index > 0) {
            toDo.add(todo);
        }
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
    }

    public void edit(int index, String todo) {
        if (index >= 0 && index < toDo.size()) {
            toDo.set(index, todo);
            System.out.println("Дело " + index + " заменено на " + todo);
        }
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
    }

    public void delete(int index) {
        if (index >= 0 && index < toDo.size()) {
            toDo.remove(index);
            System.out.println("Дело " + toDo.get(index) + " удалено");
        } else if (index > toDo.size()) {
            System.out.println("Дело с таким индексом не существует.");
        }
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
    }

    public ArrayList<String> getTodos() {
        return new ArrayList<>(toDo);
    }
    // TODO: вернуть список дел
}