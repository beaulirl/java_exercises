#Results
             | Add          |Remove        |IndexOf       |
------------ | -------------| -------------| -------------|
ArrayList    | 11390536     |25389         |21607         |
LinkedList   | 1979812      |96695         |3241          |

Исходя из вычислений, становится понятно, что при многочисленном добавлении элементов лучше использовать LinkedList, при удалении — ArrayList, а при поиске индекса LinkedList опережает ArrayList почти в 7 раз. 

             | Add          |Remove        |Size          |
------------ | -------------| -------------| -------------|
HashSet      | 8688484      |29171         |8643          |
LinkedHashSet| 15293979     |11884         |1080          |
TreeSet      | 15577041     |10263         |15125         |

В случае с Set, для операций добавления лучше выбирать HashSet, для удаления      LinkedHashSet или TreeSet, а для определения размера LinkedHashSet работает значительно быстрее других. 

             | Add          |Remove        |Get           |
------------ | -------------| -------------| -------------|
HashMap      | 12522783     |31871         |8103          |
LinkedHashMap| 5394379      |5402          |3241          |
TreeMap      | 19323828     |21068         |7563          |

Для Map видно, что быстрее всех по базовым операциям справляется LinkedHashMap.