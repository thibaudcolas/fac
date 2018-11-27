DONNEES   SEGMENT
valeur1   DB      5
valeur2   DW      8
result    DB      ?
DONNEES   ENDS

CODE      SEGMENT
ASSUME    CS:CODE,DS:DONNEES
prog      PROC NEAR
	      MOV  AX,DONNEES
	      MOV  DS,AX
	      MOV  AL,10
	      MOV  BL,valeur1
	      ADD  AL,BL
	      MOV  result,AL
	      MOV  AX,4C00H
	      INT  21H	  
prog      ENDP
CODE      ENDS

END       prog
