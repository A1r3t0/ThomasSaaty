# Лабораторная работа №6 по прикладному программированию
Испольнитель: Артюшин Артём

Группа: ФТ-220008

Программа написана на языке Java, в среде разработки Intellij IDEA. Запустить код можно в любой среде разработки для java/онлайн java компиляторе.

Код программы можно просмотреть в главной ветке: **MAI.java**

## Задание

Написать на любом языке программу, реализующую метод анализа иерархий Томаса Саати для одного уровня.
Входные данные: количество критериев, данные попарного сравнения критериев (запрашивать попарно).  
Выходные данные: весовые коэффициенты в виде 0.00.

___Описание работы___:

Сначала у пользователя запрашивается количество критериев, затем программа спрашивает у пользователя значения отношения критериев над главной диагональю, потом она сама считает значения под главной диагональю (обратные) и на самой диагонали выставляет значения = 1. После этого программа построчно считает сумму отношения критериев, их общую сумму и считает весовые коэффициенты, деля построчную сумму критериев на общую сумму. В программе включена проверка на неотрицательный ввод значения отношения критериев и неотрицательный ввод количества критериев.

**Тест 1:**

![img](https://github.com/A1r3t0/ThomasSaaty/blob/main/Снимок%20экрана%202023-10-28%20в%2022.21.42.png)

**Тест 2:**

![img](https://github.com/A1r3t0/ThomasSaaty/blob/main/Снимок%20экрана%202023-10-28%20в%2022.26.26.png)

**Тест 3:**

![img](https://github.com/A1r3t0/ThomasSaaty/blob/main/Снимок%20экрана%202023-10-28%20в%2022.29.37.png)
