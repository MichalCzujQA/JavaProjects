package util;

import org.junit.platform.engine.support.hierarchical.Node;

import java.lang.reflect.Array;
import java.time.Year;
import java.util.Arrays;

public class MyLinkedList<T> implements MyList<T>, MyQueue<T> {

    private Node<T> first;
    private Node<T> last;
    private int size;


    public void add(T value) {
        if (first == null) {
            // Не существует ни одного элемента. Добавляемая нода станет первой и пока единственной
            first = new Node<>(value, null, null);
        } else if (last == null) {
            //существует только один узел first
            // справа от first приклеить новою ноду
            last = new Node<>(value, first, null);
            // нам надо организовать связь направо от ноды first
            first.next = last;

        } else {
            // когда существует и first и last обьект
            Node<T> temp = last;
            last = new Node<>(value, temp, null);
            temp.next = last;
        }

        size++;
    }

    // добавить элемент с лева
    @Override
    public void addFirst(T value) {
        if (first == null) {
            first = new Node<>(value, null, null);
        } else if (last == null) {
            last = first;
            first = new Node<>(value, null, last);
            last.previous = first;
        } else {
            Node<T> temp = first;
            first = new Node<>(value, null, temp);
            temp.previous = first;
        }
        size++;
    }

    //мы удаляем самый первый (левый)элемент
    @Override
    public T remove() {
        if (size == 0) return null;
        //если нод больше чем 0, мы должны будем удалить ноду first
        T value = first.value;
        if (size == 1) {
            first = null;
        } else if (size == 2) {
            // у нас только 2 ноды - first && last
            // мы должны сделать last first-ом
            first = last;
//            first = first.next; альтернативний варіант
            first.previous = null;
            last = null;
        } else {
            first = first.next;
            first.previous = null;
        }
        size--;
        return value;
    }

    @Override
    public T removeLast() {
        if (size == 0) return null;
        T value;

        if (size == 1) {
            value = first.value;
            first = null;
        } else if (size == 2) {
            value = last.value;
            last = null;
            first.next = null;
        } else {
            value = last.value;
            last = last.previous;
            last.next = null;
        }


        size--;
        return value;
    }


    @Override
    public void addAll(T... values) {
        for (T value : values) {
            add(value);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(T value) {
        int index = 0;

        // перебирать мий список, начиная с головы
        // проверять - совпадает ли value  в текущем узле с тем , что мы ищем. Если совпадает - вернуть Index
        // не забыть увеличить мой счетчик индекса,
        // проверить значение в след. элементе, если оно есть.

        Node<T> cursor = first;
        while (cursor != null) {
            if (cursor.value.equals(value)) {
                return index;
            }

            index++;
            cursor = cursor.next;
        }

        return -1;
    }

    @Override
    public int lastIndexOf(T value) {
//        if (size == 0) return  -1; альтернативная
        int index = size - 1;

        // когда есть только нода first - цикл не выполнится ни разу
        Node<T> cursor = last;
        while (cursor != null) {
            if (cursor.equals(value)) {
                return index;
            }
            index--;
            cursor = cursor.previous;

        }
        //обработка сценария, когда есть только нода first
        if (size != 0 && first.value.equals(value)) return 0;
        // if ( first != null && first.value.equals(value)) return 0; альтернативная

        return -1;
    }

    private void removeNode(Node<T> node) {
        if (node == first) {
            remove();
            return;
        }
        if (node == last) {
            removeLast();
            return;
        }

        node.previous.next = node.next;
        node.next.previous = node.previous;

        //не обязательно
        node = null;
        size--;

    }

    @Override
    public boolean contains(T value) {
        return indexOf(value) >= 0;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T[] toArray() {
        //Todo возврат пустого массива Т. где взять тип Т ?
        if (first == null) return null;

        T[] result = (T[]) Array.newInstance(first.value.getClass(), size);
        Node<T> cursor = first;
        int index = 0;
        while (cursor != null) {
            result[index++] = cursor.value;
            cursor = cursor.next;
        }
        return result;
    }

    @Override
    public boolean remove(T value) {
        Node<T> cursor = first;
        while (cursor != null) {
            if (cursor.value.equals(value)) {
                removeNode(cursor);
                return true;
            }

            cursor = cursor.next;
        }
        return false;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) return null;

        Node<T> nodeForRemove = searchNodeByIndex(index);
        T value = nodeForRemove.value;

        removeNode(nodeForRemove);
        return value;


    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) return null;
        return searchNodeByIndex(index).value;
    }

    @Override
    public void set(int index, T value) {
        if (index < 0 || index >= size) return;
        searchNodeByIndex(index).value = value;
    }


    @Override
    public void addLast(T value) {
        addLast(value);
    }

    @Override
    public T getFirst() {

        return (first != null) ? first.value : null;
    }

    // значение самого правого элемента
    @Override
    public T getLast() {
        if (last != null) return last.value;
        // в котором 1 нода first:V ; last = null;
        if (first != null) return first.value;
        return null;
    }

    @Override
    public T removeFirst() {
        return removeFirst();

    }

    private Node<T> searchNodeByIndex(int index) {
        Node<T> cursor;
        if (index <= size / 2) {
            System.out.println("Left");
            cursor = first;
            for (int i = 0; i < index; i++) {
                cursor = cursor.next;
            }
        } else {
            System.out.println("Right");
            cursor = last;
            for (int i = size - 1; i > index; i--) {
                cursor = cursor.previous;
            }
        }
        return cursor;


    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (first != null) {
            sb.append(first.value);
            Node<T> cursor = first.next;
            while (cursor != null) {
                sb.append(", ");
                sb.append(cursor.value);
                cursor = cursor.next;
            }

        }
        sb.append("]");
        return sb.toString();
    }

    private static class Node<T> {
        T value;
        Node<T> previous;
        Node<T> next;


        public Node(T value, Node<T> previous, Node<T> next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }
    }
}
