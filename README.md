Кристијан Ефтимов 161110, семинарска работа по предметот веб програмирање, на факултет ФИНКИ

Опис на темата:
Страна за онлајн курсеви во која би можеле да се најават корисници и да купат одреден курс за соодветна цена која е достапна на почетната 
страна за секој курс. Исто така, на почетната страна се достапни името на курсот, краток опис, кој е авторот, во која категорија спаѓа и 
соодветна слика. Како "front-end" користев "thymeleaf", бидејќи имав неколку неуспешни обиди за користење "React".
На почеток, пред да се стартува апликацијата треба да се внесат податоците во база за админот( видете имам прикачено фајл:"dataBaseForAdminAdded" на почеток на проектот), и подоцна за најава како админ на системот потребен е емаил и пасворд, "email:admin@hotmail.com , password:admin". Со ова пристапувате на страната како админ и ги имате сите привилегии( додавање, бришење,  едитирање, пребарување, додавање во картичка и слично). Ова ми е имплементирано со помош на "spring security", односно само што стартува апликацијата се отвара страната за "login". На почеток нема најавени корисници, може да креирате веднаш штом стартува апликацијата( има соодветно копче кое води до "register" страната), и откако се најавите како корисник можете да ги гледате сите курсеви, да пребарате според името на курсот, име, презиме на авторот на курсот или името на категоријата на курсот. Исто така, постои копче за додавање на курсевите во картичка, кои подоцна би биле купени.
Ако корисник сака да купи курс, ќе добие форма во која ќе биде потребно да го внесе неговиот емаил, број на картичка, датум кога истекува и трите цифри на задниот дел на картичката. Системот за плаќање го имплементирав со помош на библиотеката "Stripe". За тестирање, искористете го мојот емаил и број на картичка( "kristijaneftimov1@hotmail.com" , "4242 4242 4242 4242" , "02/22", "222"). Притоа, системот за плаќање е имплементиран само на страната на корисниците.
Исто така, за интеграција со календар искористив "Datepicker" кој се имплементира во некое од вјуата, па јас го имплементирав на страната на регистрација на корисник, прикажувам календар каде што корисникот го избира датумот на раѓање, кој подоцна е сместен соодветно во база во табелата корисници.
Апликацијата се стартува на порта "8080", базата на податоци е на порта "3306" и за база користев "MySQL". Детални информации како се стартува базата има во application.properties.    

