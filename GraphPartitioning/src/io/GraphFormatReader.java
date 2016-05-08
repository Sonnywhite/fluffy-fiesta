package io;

/*
 * 
 * KOMMENTARE:
 * 
 * ...the graph files may contain comment lines that begin with the
 * character '%'. Such lines are ignored.
 * 
 * -----------------------------
 * 
 * PARAMETER:
 * 
 * 1. line = 2, 3 or 4 parameters:
 * 
 * The first two obligatory entries are the number of vertices and the
 * number of edges in the graph. (Note that in this case the number of edges
 * is only half of the sum of the vertex degrees.)
 * 
 * The third and fourth parameter in the first line are optional and control
 * input of weighted graphs.
 * 
 * (Important: if the graph contains self-loops and/or multiple edges, the
 * third parameter in the first line is set to 100
 * 
 * note that in this case the second parameter is the actual number of edge
 * entries in the file, = sum of the vertex degrees
 * 
 * deviation is necessary due to self-loops. They do not appear twice in the
 * file, as undirected (= bidirected) edges do.)
 * 
 * -----------------------------
 * 
 * KNOTEN:
 * 
 * In the unweighted case, the remaining n lines contain neighbor lists for
 * each vertex from 1 to n in order.
 * 
 * These lists are sets of integers separated by spaces and contain all the
 * neighbors of a given vertex. (The neighbors may be listed in any order.)
 * Note that vertices are numbered 1 to n, not from 0 to n-1.
 * 
 */

public class GraphFormatReader {

}
