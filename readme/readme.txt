/backup/S_N/testing/test/fitnesse/workspace/Fitnesse> java -jar ./lib/fitnesse-standalone.jar -p 5080

Calculator Wiki
--------------------------
!define TEST_SYSTEM {slim}
!path /backup/S_N/testing/test/fitnesse/workspace/Fitnesse/bin/
!path /backup/S_N/testing/test/fitnesse/workspace/Fitnesse/lib/*.jar

#!***> Classpath

!path ${java.class.path}
!define TEST_SYSTEM {slim}
!define COLLAPSE_SETUP {true}
!define COLLAPSE_TEARDOWN {true}

#*!

|Import                      |
|com.ankur.calculator.fixture|
|org.apache.log4j.Logger     |

|Calculator Fixture                            |
|first|second|add?|substract?|divide?|multiply?|
|4    |5     |9.0 |-1.0      |0.8    |20.0     |
|-1   |10    |9.0 |-11.0     |-0.1   |-10.0    |
|22   |7     |29.0|15.0      |~=3.14 |154.0    |

InventoryService > findByName
------------------------------------
!***> Setup

!define TEST_SYSTEM {slim}
!path /backup/S_N/testing/test/fitnesse/workspace/Fitnesse/bin/
!path /backup/S_N/testing/test/fitnesse/workspace/Fitnesse/lib/*.jar

!path ${java.class.path}
!define TEST_SYSTEM {slim}
!define COLLAPSE_SETUP {true}
!define COLLAPSE_TEARDOWN {true}
*!
|Import                     |
|com.ankur.inventory.fixture|
|org.apache.log4j.Logger    |

|Inventory Find By Name Fixture                                                           |
|name |id? |price?      |manufacturedBy?|description?                                     |
|lamp |3,4,|65.99,67.99,|Costco,Genie,  |Teak lamp - brown color,Magic lamp with 3 wishes,|
|phone|2,  |100.33,     |Samsung,       |Android phone,                                   |



