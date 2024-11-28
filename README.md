**Concurrent Programming โดย
ใช้ภาษา Java**

แนะนํา Java Thread และ
Concurrency
• Java สร้างโดยคิดเรื่อง Concurrency ตั้งแต่เริ่มต้นตอนออกแบบภาษา
• ให้มีกลไกคือ Thread เพื่อใช้ในการเขียนโปรแกรมแบบ Concurrency โดยให้ Build-in ในภาษา java เลย
• In Java, a thread is the smallest unit of execution. It
is an independent path of execution running within
a program. Threads share the same address space,
meaning they have access to the same variables and
data structures of the program.
• However, each thread maintains its own program
counter, stack, and local variables, enabling it to
operate independently. This design also facilitates
interaction among threads when necessary.
• Operating System จะใช้ Algorithm “Preemptive- priority scheduling” ในการเลือก Thread มารัน และ ให้ CPU
Time จํานวนหนึ่ง แก่ Thread ที่มี Priority สูงสุด หากระหว่างการรันมี
Thread ที่มีค่า Priority สูงกว่า อยู่ในสถานะพร้อมรัน (Runnable) ระบบปฏิบัติการจะยึดคืน CPU Time เพื่อหยุดการรัน Thread ปัจจุบัน และให้ Thread ที่มี Priority สูงกว่าได้รัน
