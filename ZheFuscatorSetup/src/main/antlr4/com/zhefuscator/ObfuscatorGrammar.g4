grammar ObfuscatorGrammar;

@header {
	import java.util.Map;
	import java.util.HashMap;
}

@members {
	Map<String, Boolean> sensitive = new HashMap<String, Boolean>();
}

r0: r1 r2
;
r1: TOKEN0 {sensitive.put($TOKEN0.text, false); }
;
r2: r3 r4
;
r3: TOKEN1 {sensitive.put($TOKEN1.text, false); }
;
r4: TOKEN2 {sensitive.put($TOKEN2.text, true); }
;

TOKEN0: [r][e][c][e][i][v][e][d];
TOKEN1: [h][o][s][t];
TOKEN2: [0-9]*[.][0-9]*[.][0-9]*[.][0-9]*;

WHITESPACE: ' ' -> skip;