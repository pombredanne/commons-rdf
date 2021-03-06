package org.apache.commons.rdf;

/**
 * An <a href= "http://www.w3.org/TR/rdf11-concepts/#dfn-blank-node" >RDF-1.1
 * Blank Node</a>, as defined by <a href=
 * "http://www.w3.org/TR/rdf11-concepts/#section-blank-nodes" >RDF-1.1 Concepts
 * and Abstract Syntax</a>, a W3C Recommendation published on 25 February 2014.<br>
 * <p/>
 * Note that: <dd>Blank nodes are disjoint from IRIs and literals. Otherwise,
 * the set of possible blank nodes is arbitrary. RDF makes no reference to any
 * internal structure of blank nodes.</dd><br>
 * <p/>
 * Also note that: <dd>Blank node identifiers are local identifiers that are
 * used in some concrete RDF syntaxes or RDF store implementations. They are
 * always locally scoped to the file or RDF store, and are not persistent or
 * portable identifiers for blank nodes. Blank node identifiers are not part of
 * the RDF abstract syntax, but are entirely dependent on the concrete syntax or
 * implementation. The syntactic restrictions on blank node identifiers, if any,
 * therefore also depend on the concrete RDF syntax or implementation.
 * Implementations that handle blank node identifiers in concrete syntaxes need
 * to be careful not to create the same blank node from multiple occurrences of
 * the same blank node identifier except in situations where this is supported
 * by the syntax.</dd>
 *
 * @see <a href= "http://www.w3.org/TR/rdf11-concepts/#dfn-blank-node" >RDF-1.1
 * Blank Node</a>
 */
public interface BlankNode extends Resource {

    /**
     * Return a <a href=
     * "http://www.w3.org/TR/rdf11-concepts/#dfn-blank-node-identifier">label</a>
     * for the blank node. This is not a serialization/syntax label. It should
     * be uniquely identifying within the local scope it is created in but has
     * no uniqueness guarantees other than that.<br>
     * <p/>
     * In particular, the existence of two objects of type {@link BlankNode}
     * with the same value returned from {@link #getLabel()} are not equivalent
     * unless they are known to have been created in the same local scope.<br>
     * <p/>
     * An example of a local scope may be an instance of a Java Virtual Machine
     * (JVM). In the context of a JVM instance, an implementor may support
     * insertion and removal of {@link Triple} objects containing Blank Nodes
     * without modifying the blank node labels.<br>
     * <p/>
     * Another example of a local scope may be a <a
     * href="http://www.w3.org/TR/rdf11-concepts/#section-rdf-graph">Graph</a>
     * or <a
     * href="http://www.w3.org/TR/rdf11-concepts/#section-dataset">Dataset</a>
     * created from a single document. In this context, an implementor should
     * reasonably guarantee that the label returned by getLabel only maps to
     * equivalent blank nodes in the same Graph or Dataset, but they may not
     * guarantee that it is unique for the JVM instance. In this case, the
     * implementor may support a mechanism to provide a mapping for blank nodes
     * between Graph or Dataset instances to guarantee their uniqueness.<br>
     * <p/>
     * If implementors support <a
     * href="http://www.w3.org/TR/rdf11-concepts/#section-skolemization"
     * >Skolemisation</a>, they may map instances of {@link BlankNode} objects
     * to {@link IRI} objects to reduce scoping issues.
     *
     * @return A label for the {@link BlankNode}.
     */
    String getLabel();

}
