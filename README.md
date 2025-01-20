# Kiosk Project
> 이 프로젝트는 간단한 키오스크 프로그램입니다. 사용자가 다양한 메뉴를 선택하고, 장바구니에 추가하여 주문을 진행하거나 취소할 수 있습니다. 또한, 할인 적용을 통해 최종 결제 금액을 계산할 수 있는 기능을 제공합니다.

<br>

## Table of Contents
* [Technologies Used](#technologies-used)
* [Classes Overview](#classes-overview)
* [Features](#features)
* [Screenshots](#screenshots)
* [Usage](#usage)
* [Contact](#contact)


<br>

## Technologies Used
<div align=center> 
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> 
    <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
  <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">
</div>

- **Java**
  - `Java`는 키오스크 시스템 개발의 주요 프로그래밍 언어로 활용되었으며, 다양한 기능 구현에 기여했습니다.

  - **Scanner**

    - 사용자로부터 입력을 받아 키오스크 메뉴 선택, 주문 처리, 결제 과정을 수행합니다. 사용자의 선택을 정확히 파악하기 위한 주요 입력 도구로 사용되었습니다.
  - **ArrayList**
    - 메뉴 항목, 주문 내역, 결제 기록 등을 저장하고 관리하는 데 사용되었습니다. `ArrayList`의 동적 관리 기능을 활용하여 데이터의 추가, 삭제 및 조회가 유연하게 이루어졌습니다.
  - **캡슐화 (Encapsulation)**
    - 메뉴 정보와 주문 데이터는 `private` 필드로 캡슐화되어 있으며, 이를 안전하게 조작할 수 있도록 `public getter`와 `setter` 메서드가 제공됩니다. 이를 통해 데이터 무결성을 보장합니다.
  - **Switch-Case**
    - 키오스크의 메뉴 선택 및 기능별 동작(예: 주문 추가, 주문 삭제, 결제 확인 등)을 처리하기 위해 사용되었습니다. 코드의 가독성을 높이며 새로운 메뉴나 기능 추가 시 확장성을 제공합니다.
  - **예외 처리 (try-catch)**
    - 잘못된 사용자 입력이나 계산 오류를 방지하기 위해 예외 처리 기법을 사용하여 프로그램이 중단되지 않도록 설계되었습니다. 사용자 경험을 개선하고 시스템의 안정성을 높였습니다.

  - **클래스와 객체지향 설계**

    - 키오스크 시스템은 객체지향적인 구조로 설계되었습니다. 각 메뉴 항목, 주문 내역, 결제 시스템 등을 클래스와 객체로 구분하여 코드의 재사용성과 확장성을 확보했습니다.

<br>

## Classes Overview
### `Kiosk.java`
> 메인 실행 클래스. 프로그램의 시작과 흐름을 제어하며, 메뉴 출력 및 사용자 입력을 처리합니다.
- **`method`**

  - `start()`: 프로그램 실행 및 메인 메뉴 관리.
 
  - `printMenu(Scanner sc, Menu menu)`: 선택한 카테고리의 메뉴 출력 및 항목 추가 처리.
 
  - `showCart()`: 장바구니 출력 및 총 금액 계산.
 
  - `applyDiscount(double total)`: 사용자 그룹별 할인율 적용.

<br>

### `Cart.java`
> 장바구니를 관리하는 클래스. 메뉴 항목을 추가, 삭제하며 총 금액을 계산합니다.
- **`method`**

  - `addItem(MenuItem item)`: 장바구니에 항목 추가.
 
  - `clearItems()`: 장바구니 비우기.
 
  - `printCart()`: 장바구니에 담긴 항목 출력.
 
  - `calculateTotalPrice()`: 총 금액 계산.

<br>

### `Menu.java`
> 메뉴 카테고리를 나타내는 클래스. 각 카테고리별로 메뉴 항목들을 관리합니다.

- **`method`**

  - `printMenuItems()`: 카테고리에 포함된 메뉴 항목 출력.
 
<br>

### `MenuItem.java`
> 개별 메뉴 항목을 나타내는 클래스. 메뉴 이름, 가격 등을 저장합니다.

- **`method`**

  - `getMenuPrice()`: 메뉴의 가격 반환.
 
  - `toStringWithoutNumber()`: 번호를 제외한 메뉴 항목 정보 출력.

<br>

## Features
- 메뉴 관리: 다양한 카테고리와 메뉴 항목을 구성하고 출력합니다.

- 장바구니 기능:

  - 사용자가 선택한 메뉴를 장바구니에 추가하고, 주문 내역을 확인합니다.

  - 장바구니 항목을 비우거나 주문을 취소할 수 있습니다.

- 총 금액 계산: 장바구니에 담긴 항목들의 총 금액을 계산합니다.

- 할인 적용: 국가유공자, 군인, 학생 등 특정 사용자 그룹에 대한 할인율 적용이 가능합니다.

- 유효성 검사: 숫자 입력 및 메뉴 선택 시 유효성 검사를 수행하여 잘못된 입력을 방지합니다.

- 콘솔 기반 UI: 사용자가 쉽게 상호작용할 수 있도록 메뉴와 선택지를 출력합니다.

  <br>
  
## Screenshots
![image](https://github.com/user-attachments/assets/d7994a12-211c-43c4-8699-7096a0df8062)
![image](https://github.com/user-attachments/assets/83706fdc-734b-4245-93ba-c83153268f52)
![image](https://github.com/user-attachments/assets/274ab5eb-0b47-40ff-90ec-5f24923d1385)
![image](https://github.com/user-attachments/assets/6869c48e-2552-4f3c-adcf-226680bd2a6c)

<br>

## Usage
**1. 프로그램 시작**
= 프로그램 실행 후 메인 메뉴가 출력됩니다.

  - `1, 2, 3, ...`: 각 카테고리를 선택하여 메뉴를 확인합니다.

  - `4`: 장바구니를 확인합니다.

  - `5`: 진행 중인 주문을 취소합니다.

  - `0`: 프로그램 종료.

**2. 메뉴 선택**
- 선택한 카테고리에서 메뉴 항목을 확인하고, 장바구니에 추가할 수 있습니다.

**3. 장바구니 관리**

- 선택한 메뉴들을 확인하고, 필요에 따라 삭제할 수 있습니다.

- 총 금액 확인 후, 주문을 진행합니다.

**4. 할인 적용 및 결제**

- 사용자 유형에 따른 할인율을 적용하여 최종 금액을 계산합니다.

<br>

## Contact
Created by 
[@JoeMinKyung](https://github.com/JoeMinKyung)
<br>

문의사항이 있다면 언제든지 연락주세요!
