---


---

<h1 id="sqrt-decomposition">Sqrt Decomposition</h1>
<p>Es un método que te permite contestar consultas en cierto rango con complejidad <span class="katex--inline"><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi>O</mi><mo stretchy="false">(</mo><msqrt><mi>N</mi></msqrt><mo stretchy="false">)</mo></mrow><annotation encoding="application/x-tex">O(\sqrt{N})</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1.17667em; vertical-align: -0.25em;"></span><span class="mord mathdefault" style="margin-right: 0.02778em;">O</span><span class="mopen">(</span><span class="mord sqrt"><span class="vlist-t vlist-t2"><span class="vlist-r"><span class="vlist" style="height: 0.926665em;"><span class="svg-align" style="top: -3em;"><span class="pstrut" style="height: 3em;"></span><span class="mord" style="padding-left: 0.833em;"><span class="mord mathdefault" style="margin-right: 0.10903em;">N</span></span></span><span class="" style="top: -2.88666em;"><span class="pstrut" style="height: 3em;"></span><span class="hide-tail" style="min-width: 0.853em; height: 1.08em;"><svg width="400em" height="1.08em" viewBox="0 0 400000 1080" preserveAspectRatio="xMinYMin slice"><path d="M95,702c-2.7,0,-7.17,-2.7,-13.5,-8c-5.8,-5.3,-9.5,
-10,-9.5,-14c0,-2,0.3,-3.3,1,-4c1.3,-2.7,23.83,-20.7,67.5,-54c44.2,-33.3,65.8,
-50.3,66.5,-51c1.3,-1.3,3,-2,5,-2c4.7,0,8.7,3.3,12,10s173,378,173,378c0.7,0,
35.3,-71,104,-213c68.7,-142,137.5,-285,206.5,-429c69,-144,104.5,-217.7,106.5,
-221c5.3,-9.3,12,-14,20,-14H400000v40H845.2724s-225.272,467,-225.272,467
s-235,486,-235,486c-2.7,4.7,-9,7,-19,7c-6,0,-10,-1,-12,-3s-194,-422,-194,-422
s-65,47,-65,47z M834 80H400000v40H845z"></path></svg></span></span></span><span class="vlist-s">​</span></span><span class="vlist-r"><span class="vlist" style="height: 0.113335em;"><span class=""></span></span></span></span></span><span class="mclose">)</span></span></span></span></span>.</p>
<h3 id="descripción">Descripción</h3>
<p>La idea básica de sqrt es el pre-procesamiento. Se dividirá el arreglo <span class="katex--inline"><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi>A</mi></mrow><annotation encoding="application/x-tex">A</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.68333em; vertical-align: 0em;"></span><span class="mord mathdefault">A</span></span></span></span></span> en bloques de longitud <span class="katex--inline"><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi>s</mi><mo>=</mo><mrow><mo fence="true">⌈</mo><msqrt><mi>N</mi></msqrt><mo fence="true">⌉</mo></mrow></mrow><annotation encoding="application/x-tex">s = \left \lceil \sqrt{N} \right \rceil</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.43056em; vertical-align: 0em;"></span><span class="mord mathdefault">s</span><span class="mspace" style="margin-right: 0.277778em;"></span><span class="mrel">=</span><span class="mspace" style="margin-right: 0.277778em;"></span></span><span class="base"><span class="strut" style="height: 1.80002em; vertical-align: -0.65002em;"></span><span class="minner"><span class="mopen delimcenter" style="top: 0em;"><span class="delimsizing size2">⌈</span></span><span class="mord sqrt"><span class="vlist-t vlist-t2"><span class="vlist-r"><span class="vlist" style="height: 0.926665em;"><span class="svg-align" style="top: -3em;"><span class="pstrut" style="height: 3em;"></span><span class="mord" style="padding-left: 0.833em;"><span class="mord mathdefault" style="margin-right: 0.10903em;">N</span></span></span><span class="" style="top: -2.88666em;"><span class="pstrut" style="height: 3em;"></span><span class="hide-tail" style="min-width: 0.853em; height: 1.08em;"><svg width="400em" height="1.08em" viewBox="0 0 400000 1080" preserveAspectRatio="xMinYMin slice"><path d="M95,702c-2.7,0,-7.17,-2.7,-13.5,-8c-5.8,-5.3,-9.5,
-10,-9.5,-14c0,-2,0.3,-3.3,1,-4c1.3,-2.7,23.83,-20.7,67.5,-54c44.2,-33.3,65.8,
-50.3,66.5,-51c1.3,-1.3,3,-2,5,-2c4.7,0,8.7,3.3,12,10s173,378,173,378c0.7,0,
35.3,-71,104,-213c68.7,-142,137.5,-285,206.5,-429c69,-144,104.5,-217.7,106.5,
-221c5.3,-9.3,12,-14,20,-14H400000v40H845.2724s-225.272,467,-225.272,467
s-235,486,-235,486c-2.7,4.7,-9,7,-19,7c-6,0,-10,-1,-12,-3s-194,-422,-194,-422
s-65,47,-65,47z M834 80H400000v40H845z"></path></svg></span></span></span><span class="vlist-s">​</span></span><span class="vlist-r"><span class="vlist" style="height: 0.113335em;"><span class=""></span></span></span></span></span><span class="mclose delimcenter" style="top: 0em;"><span class="delimsizing size2">⌉</span></span></span></span></span></span></span> y para cada bloque resolveremos el problema.</p>
<p>El ultimo bloque puede contener menos de <span class="katex--inline"><span class="katex"><span class="katex-mathml"><math><semantics><mrow><msqrt><mi>N</mi></msqrt></mrow><annotation encoding="application/x-tex">\sqrt{N}</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1.04em; vertical-align: -0.113335em;"></span><span class="mord sqrt"><span class="vlist-t vlist-t2"><span class="vlist-r"><span class="vlist" style="height: 0.926665em;"><span class="svg-align" style="top: -3em;"><span class="pstrut" style="height: 3em;"></span><span class="mord" style="padding-left: 0.833em;"><span class="mord mathdefault" style="margin-right: 0.10903em;">N</span></span></span><span class="" style="top: -2.88666em;"><span class="pstrut" style="height: 3em;"></span><span class="hide-tail" style="min-width: 0.853em; height: 1.08em;"><svg width="400em" height="1.08em" viewBox="0 0 400000 1080" preserveAspectRatio="xMinYMin slice"><path d="M95,702c-2.7,0,-7.17,-2.7,-13.5,-8c-5.8,-5.3,-9.5,
-10,-9.5,-14c0,-2,0.3,-3.3,1,-4c1.3,-2.7,23.83,-20.7,67.5,-54c44.2,-33.3,65.8,
-50.3,66.5,-51c1.3,-1.3,3,-2,5,-2c4.7,0,8.7,3.3,12,10s173,378,173,378c0.7,0,
35.3,-71,104,-213c68.7,-142,137.5,-285,206.5,-429c69,-144,104.5,-217.7,106.5,
-221c5.3,-9.3,12,-14,20,-14H400000v40H845.2724s-225.272,467,-225.272,467
s-235,486,-235,486c-2.7,4.7,-9,7,-19,7c-6,0,-10,-1,-12,-3s-194,-422,-194,-422
s-65,47,-65,47z M834 80H400000v40H845z"></path></svg></span></span></span><span class="vlist-s">​</span></span><span class="vlist-r"><span class="vlist" style="height: 0.113335em;"><span class=""></span></span></span></span></span></span></span></span></span><br>
elementos.</p>
<p>Una vez calculada la respuesta para cada bloque, como podemos obtener la respuesta en el rango <span class="katex--inline"><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mo fence="true">[</mo><mi>L</mi><mo separator="true">,</mo><mi>R</mi><mo fence="true">]</mo></mrow><annotation encoding="application/x-tex">\left [ L,R \right ]</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="minner"><span class="mopen delimcenter" style="top: 0em;">[</span><span class="mord mathdefault">L</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.166667em;"></span><span class="mord mathdefault" style="margin-right: 0.00773em;">R</span><span class="mclose delimcenter" style="top: 0em;">]</span></span></span></span></span></span> ?</p>
<p>Lo primero que hay que darse cuenta es que si el rango <span class="katex--inline"><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mo fence="true">[</mo><mi>L</mi><mo separator="true">,</mo><mi>R</mi><mo fence="true">]</mo></mrow><annotation encoding="application/x-tex">\left [ L,R \right ]</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="minner"><span class="mopen delimcenter" style="top: 0em;">[</span><span class="mord mathdefault">L</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.166667em;"></span><span class="mord mathdefault" style="margin-right: 0.00773em;">R</span><span class="mclose delimcenter" style="top: 0em;">]</span></span></span></span></span></span> es grande, este rango contendrá rangos  completos que nosotros ya tenemos pre-calculados y puede contener rangos no completos, cuya longitud sera menor a <span class="katex--inline"><span class="katex"><span class="katex-mathml"><math><semantics><mrow><msqrt><mi>N</mi></msqrt></mrow><annotation encoding="application/x-tex">\sqrt{N}</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1.04em; vertical-align: -0.113335em;"></span><span class="mord sqrt"><span class="vlist-t vlist-t2"><span class="vlist-r"><span class="vlist" style="height: 0.926665em;"><span class="svg-align" style="top: -3em;"><span class="pstrut" style="height: 3em;"></span><span class="mord" style="padding-left: 0.833em;"><span class="mord mathdefault" style="margin-right: 0.10903em;">N</span></span></span><span class="" style="top: -2.88666em;"><span class="pstrut" style="height: 3em;"></span><span class="hide-tail" style="min-width: 0.853em; height: 1.08em;"><svg width="400em" height="1.08em" viewBox="0 0 400000 1080" preserveAspectRatio="xMinYMin slice"><path d="M95,702c-2.7,0,-7.17,-2.7,-13.5,-8c-5.8,-5.3,-9.5,
-10,-9.5,-14c0,-2,0.3,-3.3,1,-4c1.3,-2.7,23.83,-20.7,67.5,-54c44.2,-33.3,65.8,
-50.3,66.5,-51c1.3,-1.3,3,-2,5,-2c4.7,0,8.7,3.3,12,10s173,378,173,378c0.7,0,
35.3,-71,104,-213c68.7,-142,137.5,-285,206.5,-429c69,-144,104.5,-217.7,106.5,
-221c5.3,-9.3,12,-14,20,-14H400000v40H845.2724s-225.272,467,-225.272,467
s-235,486,-235,486c-2.7,4.7,-9,7,-19,7c-6,0,-10,-1,-12,-3s-194,-422,-194,-422
s-65,47,-65,47z M834 80H400000v40H845z"></path></svg></span></span></span><span class="vlist-s">​</span></span><span class="vlist-r"><span class="vlist" style="height: 0.113335em;"><span class=""></span></span></span></span></span></span></span></span></span>.</p>
<p>En el peor de los casos iteraremos sobre <span class="katex--inline"><span class="katex"><span class="katex-mathml"><math><semantics><mrow><msqrt><mi>N</mi></msqrt></mrow><annotation encoding="application/x-tex">\sqrt{N}</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1.04em; vertical-align: -0.113335em;"></span><span class="mord sqrt"><span class="vlist-t vlist-t2"><span class="vlist-r"><span class="vlist" style="height: 0.926665em;"><span class="svg-align" style="top: -3em;"><span class="pstrut" style="height: 3em;"></span><span class="mord" style="padding-left: 0.833em;"><span class="mord mathdefault" style="margin-right: 0.10903em;">N</span></span></span><span class="" style="top: -2.88666em;"><span class="pstrut" style="height: 3em;"></span><span class="hide-tail" style="min-width: 0.853em; height: 1.08em;"><svg width="400em" height="1.08em" viewBox="0 0 400000 1080" preserveAspectRatio="xMinYMin slice"><path d="M95,702c-2.7,0,-7.17,-2.7,-13.5,-8c-5.8,-5.3,-9.5,
-10,-9.5,-14c0,-2,0.3,-3.3,1,-4c1.3,-2.7,23.83,-20.7,67.5,-54c44.2,-33.3,65.8,
-50.3,66.5,-51c1.3,-1.3,3,-2,5,-2c4.7,0,8.7,3.3,12,10s173,378,173,378c0.7,0,
35.3,-71,104,-213c68.7,-142,137.5,-285,206.5,-429c69,-144,104.5,-217.7,106.5,
-221c5.3,-9.3,12,-14,20,-14H400000v40H845.2724s-225.272,467,-225.272,467
s-235,486,-235,486c-2.7,4.7,-9,7,-19,7c-6,0,-10,-1,-12,-3s-194,-422,-194,-422
s-65,47,-65,47z M834 80H400000v40H845z"></path></svg></span></span></span><span class="vlist-s">​</span></span><span class="vlist-r"><span class="vlist" style="height: 0.113335em;"><span class=""></span></span></span></span></span></span></span></span></span>  bloques, de ahi la complejidad.</p>
<h3 id="division--arreglo-tamaño-9">Division  Arreglo tamaño 9</h3>
<p><img src="https://media.geeksforgeeks.org/wp-content/uploads/sqrt_root.png" alt="Division de la imagen"></p>
<h3 id="responder-query-con-bloques-completos">Responder query con bloques completos</h3>
<p><img src="https://media.geeksforgeeks.org/wp-content/uploads/sqrt_root1.png" alt="enter image description here"></p>
<h3 id="responder-query-con-bloques-incompletos">Responder query con bloques incompletos</h3>
<p><img src="https://media.geeksforgeeks.org/wp-content/uploads/sqrt_root2.png" alt="enter image description here"></p>
<h3 id="problema-1">Problema 1</h3>
<blockquote>
<p>Dado un arreglo A de enteros y queries del tipo</p>
<ol>
<li>[L,R] -&gt; suma en el rango [L,R]</li>
<li>idx, val -&gt; modificar el elemento en la posicion idx con val.</li>
</ol>
</blockquote>
<pre class=" language-cpp"><code class="prism  language-cpp"><span class="token comment">// input data</span>
<span class="token keyword">int</span> n<span class="token punctuation">;</span>
vector<span class="token operator">&lt;</span><span class="token keyword">int</span><span class="token operator">&gt;</span> <span class="token function">a</span> <span class="token punctuation">(</span>n<span class="token punctuation">)</span><span class="token punctuation">;</span>

<span class="token comment">// preprocessing</span>
<span class="token keyword">int</span> len <span class="token operator">=</span> <span class="token punctuation">(</span><span class="token keyword">int</span><span class="token punctuation">)</span> <span class="token function">sqrt</span> <span class="token punctuation">(</span>n <span class="token operator">+</span> <span class="token punctuation">.</span><span class="token number">0</span><span class="token punctuation">)</span> <span class="token operator">+</span> <span class="token number">1</span><span class="token punctuation">;</span> <span class="token comment">// size of the block and the number of blocks</span>
vector<span class="token operator">&lt;</span>CualquierCosa<span class="token operator">&gt;</span> <span class="token function">b</span> <span class="token punctuation">(</span>len<span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token keyword">int</span> i<span class="token operator">=</span><span class="token number">0</span><span class="token punctuation">;</span> i<span class="token operator">&lt;</span>n<span class="token punctuation">;</span> <span class="token operator">++</span>i<span class="token punctuation">)</span>
    b<span class="token punctuation">[</span>i <span class="token operator">/</span> len<span class="token punctuation">]</span> <span class="token operator">+</span><span class="token operator">=</span> a<span class="token punctuation">[</span>i<span class="token punctuation">]</span><span class="token punctuation">;</span>

<span class="token comment">// answering the queries</span>
<span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token punctuation">;</span><span class="token punctuation">;</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
    <span class="token keyword">int</span> l<span class="token punctuation">,</span> r<span class="token punctuation">;</span>
  <span class="token comment">// read input data for the next query</span>
    <span class="token keyword">int</span> sum <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span>
    <span class="token keyword">for</span> <span class="token punctuation">(</span><span class="token keyword">int</span> i<span class="token operator">=</span>l<span class="token punctuation">;</span> i<span class="token operator">&lt;=</span>r<span class="token punctuation">;</span> <span class="token punctuation">)</span>
        <span class="token keyword">if</span> <span class="token punctuation">(</span>i <span class="token operator">%</span> len <span class="token operator">==</span> <span class="token number">0</span> <span class="token operator">&amp;&amp;</span> i <span class="token operator">+</span> len <span class="token operator">-</span> <span class="token number">1</span> <span class="token operator">&lt;=</span> r<span class="token punctuation">)</span> <span class="token punctuation">{</span>
            <span class="token comment">// if the whole block starting at i belongs to [l, r]</span>
            sum <span class="token operator">+</span><span class="token operator">=</span> b<span class="token punctuation">[</span>i <span class="token operator">/</span> len<span class="token punctuation">]</span><span class="token punctuation">;</span>
            i <span class="token operator">+</span><span class="token operator">=</span> len<span class="token punctuation">;</span>
        <span class="token punctuation">}</span>
        <span class="token keyword">else</span> <span class="token punctuation">{</span>
            sum <span class="token operator">+</span><span class="token operator">=</span> a<span class="token punctuation">[</span>i<span class="token punctuation">]</span><span class="token punctuation">;</span>
            <span class="token operator">++</span>i<span class="token punctuation">;</span>
        <span class="token punctuation">}</span>
<span class="token punctuation">}</span>

</code></pre>
<h3 id="actualizar-algún-elemento">Actualizar algún elemento</h3>
<p>Para actualizar un elemento, basta con actualizar el bloque al que pertenece el elemento.</p>
<h3 id="queries-en-rango-y-updates-en-rango">Queries en rango y updates en rango</h3>
<p><a href="https://www.spoj.com/problems/GIVEAWAY/">https://www.spoj.com/problems/GIVEAWAY/</a></p>
<p>1 2 3 4 5<br>
4,2,3,5,7<br>
4,2,3,5,4</p>
<p>0 [3,4,5] -&gt; 2 {5,7} &gt;= 5<br>
1 [5,4]<br>
0 [3,4,5] -&gt; 1 {5} &gt;= 5<br>
0 a b c [a,b] cuantos elementos son mayores que c<br>
1 a b ath b</p>
<p>len  = 3<br>
1,2,3    4,5,6         7,8,9</p>
<p>A = {5,4,6,    7,9,8,     0,1,2}<br>
b = {{4,5,6},     {7,8,9}   {1,2,0}}</p>
<p>int posBloque = (ath)/len;</p>
<p>7 -&gt; 0</p>
<p>n = estudiantes<br>
m = preguntas del examen</p>
<p>n = 3 m = 5</p>
<pre><code>      12345
</code></pre>
<p>1 -&gt;             01101 -&gt; 4<br>
2 -&gt;             10100 -&gt; 3<br>
3 -&gt;             00011 -&gt; 3</p>
<p>10<br>
01</p>
<p>2-(a^b)</p>
<p>int len1 = M/2;<br>
int len2 = M-len1;</p>
<p>10<br>
1 -&gt; 0  -&gt; 4<br>
2 -&gt; 2  -&gt; 1<br>
3 -&gt; 1 -&gt;  2</p>
<p>map&lt;vi,int&gt; {4,1,2}<br>
101<br>
1 -&gt; 3<br>
2 -&gt; 2<br>
3 -&gt; 1</p>
<p>101010<br>
010110</p>
<h1 id="mos-algorithm">Mo’s Algorithm</h1>
<p>Responder queries en un rango</p>
<ol>
<li>Offline (Puedes recibir todas las queries y las respondes despues)</li>
<li>No hay updates</li>
<li>F[L,R] -&gt; F[L+1,R], F[L-1,R], F[L,R+1], F[L,R-1]</li>
</ol>
<h3 id="problema-1-dquery">Problema 1 (DQuery)</h3>
<p>5<br>
1 1 2 1 3<br>
3<br>
1 5<br>
2 4<br>
3 5</p>
<p>l = 0,r = 0</p>
<p>[0,4]<br>
[1,3]<br>
[2,4]<br>
L    R<br>
1 1 2 1 3<br>
0 1 2 3 4</p>
<p>Q*N</p>
<h2 id="mos">Mos</h2>
<p>Si primero ordenamos las queries podemos conseguir la siguiente complejidad.</p>
<p>Como ordenamos las queries?</p>
<p>l = sqrt(N);</p>
<p>[l1,r1],[l2,r2],[l3,r3]</p>
<p>Ordenas<br>
[l1/l,r1]<br>
[l2/l,r2]<br>
[l3/l,r3]</p>
<p>O((N+Q)*sqrt(N))</p>
<h3 id="pasos">Pasos</h3>
<ol>
<li>Recibir la queries</li>
<li>Sacamos el tamaño de cada bloque l = sqrt(N)</li>
<li>Ordenar las queries desde el bloque mas pequño al bloque mas grande</li>
</ol>
<p>[l1,r1] -&gt; [l1/sqrt(N),r1]<br>
[l2,r2] -&gt; [l2/srt(N),r2]<br>
[l3,r3] -&gt; [l3/sqrt(N),r3]</p>

