grammar ZheGrammar;

@header {
	import java.util.Map;
	import java.util.HashMap;
}

@members {
	Map<Integer, Boolean> isSensitive = new HashMap<Integer, Boolean>();
}

r0: r1 r2 ;
r1: TOKEN0 
{
	isSensitive.put($TOKEN0.type, false);
};
r2: r3 r4 ;
r3: TOKEN1 
{
	isSensitive.put($TOKEN1.type, true);
};
r4: r5 r6 ;
r5: TOKEN2 
{
	isSensitive.put($TOKEN2.type, false);
};
r6: r7 r8 ;
r7: TOKEN3 
{
	isSensitive.put($TOKEN3.type, false);
};
r8: r9 r10 ;
r9: TOKEN4 
{
	isSensitive.put($TOKEN4.type, false);
};
r10: r11 r12 ;
r11: TOKEN5 
{
	isSensitive.put($TOKEN5.type, false);
};
r12: TOKEN6 
{
	isSensitive.put($TOKEN6.type, false);
};

TOKEN0: [z][h][e][f][u][s][c][a][t][o][r];
TOKEN1: [1][3][.][1][2][3][.][1][2][3][.][1][2][3];
TOKEN2: [r][e][c][e][i][v][e][d];
TOKEN3: [h][o][s][t];
TOKEN4: [1][2][3][.][1][2][3][.][1][2][3][.][1][2][3];
TOKEN5: [h][o][s][t][s];
TOKEN6: [1][1][.][1][1][.][1][1][.][1][1];

WHITESPACE: ' ' -> skip;
