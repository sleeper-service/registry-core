/* CVS $Id: $ */
package com.epimorphics.registry.vocab; 
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.ontology.*;
 
/**
 * Vocabulary definitions from file:/home/der/projects/java-workspace/ukl/ukl-registry-poc/src/main/vocabs/prov.ttl 
 * @author Auto-generated by schemagen on 22 Apr 2013 14:30 
 */
public class Prov {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static OntModel m_model = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.w3.org/ns/prov#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>An object property to express the accountability of an agent towards another 
     *  agent. The subordinate agent acted on behalf of the responsible agent in an 
     *  actual activity.</p>
     */
    public static final ObjectProperty actedOnBehalfOf = m_model.createObjectProperty( "http://www.w3.org/ns/prov#actedOnBehalfOf" );
    
    public static final ObjectProperty activity = m_model.createObjectProperty( "http://www.w3.org/ns/prov#activity" );
    
    public static final ObjectProperty agent = m_model.createObjectProperty( "http://www.w3.org/ns/prov#agent" );
    
    public static final ObjectProperty alternateOf = m_model.createObjectProperty( "http://www.w3.org/ns/prov#alternateOf" );
    
    /** <p>The Location of any resource.This property has multiple RDFS domains to suit 
     *  multiple OWL Profiles. See &lt;a href="#prov-o-owl-profile"&gt;PROV-O OWL 
     *  Profile&lt;/a&gt;.</p>
     */
    public static final ObjectProperty atLocation = m_model.createObjectProperty( "http://www.w3.org/ns/prov#atLocation" );
    
    public static final ObjectProperty entity = m_model.createObjectProperty( "http://www.w3.org/ns/prov#entity" );
    
    public static final ObjectProperty generated = m_model.createObjectProperty( "http://www.w3.org/ns/prov#generated" );
    
    /** <p>The _optional_ Activity of an Influence, which used, generated, invalidated, 
     *  or was the responsibility of some Entity. This property is _not_ used by ActivityInfluence 
     *  (use prov:activity instead).This property has multiple RDFS domains to suit 
     *  multiple OWL Profiles. See &lt;a href="#prov-o-owl-profile"&gt;PROV-O OWL 
     *  Profile&lt;/a&gt;.</p>
     */
    public static final ObjectProperty hadActivity = m_model.createObjectProperty( "http://www.w3.org/ns/prov#hadActivity" );
    
    /** <p>The _optional_ Generation involved in an Entity's Derivation.</p> */
    public static final ObjectProperty hadGeneration = m_model.createObjectProperty( "http://www.w3.org/ns/prov#hadGeneration" );
    
    public static final ObjectProperty hadMember = m_model.createObjectProperty( "http://www.w3.org/ns/prov#hadMember" );
    
    /** <p>The _optional_ Plan adopted by an Agent in Association with some Activity. 
     *  Plan specifications are out of the scope of this specification.</p>
     */
    public static final ObjectProperty hadPlan = m_model.createObjectProperty( "http://www.w3.org/ns/prov#hadPlan" );
    
    public static final ObjectProperty hadPrimarySource = m_model.createObjectProperty( "http://www.w3.org/ns/prov#hadPrimarySource" );
    
    /** <p>The _optional_ Role that an Entity assumed in the context of an Activity. 
     *  For example, :baking prov:used :spoon; prov:qualified [ a prov:Usage; prov:entity 
     *  :spoon; prov:hadRole roles:mixing_implement ].This property has multiple RDFS 
     *  domains to suit multiple OWL Profiles. See &lt;a href="#prov-o-owl-profile"&gt;PROV-O 
     *  OWL Profile&lt;/a&gt;.</p>
     */
    public static final ObjectProperty hadRole = m_model.createObjectProperty( "http://www.w3.org/ns/prov#hadRole" );
    
    /** <p>The _optional_ Usage involved in an Entity's Derivation.</p> */
    public static final ObjectProperty hadUsage = m_model.createObjectProperty( "http://www.w3.org/ns/prov#hadUsage" );
    
    public static final ObjectProperty influenced = m_model.createObjectProperty( "http://www.w3.org/ns/prov#influenced" );
    
    /** <p>Subproperties of prov:influencer are used to cite the object of an unqualified 
     *  PROV-O triple whose predicate is a subproperty of prov:wasInfluencedBy (e.g. 
     *  prov:used, prov:wasGeneratedBy). prov:influencer is used much like rdf:object 
     *  is used.</p>
     */
    public static final ObjectProperty influencer = m_model.createObjectProperty( "http://www.w3.org/ns/prov#influencer" );
    
    public static final ObjectProperty invalidated = m_model.createObjectProperty( "http://www.w3.org/ns/prov#invalidated" );
    
    /** <p>If this Activity prov:wasAssociatedWith Agent :ag, then it can qualify the 
     *  Association using prov:qualifiedAssociation [ a prov:Association; prov:agent 
     *  :ag; :foo :bar ].</p>
     */
    public static final ObjectProperty qualifiedAssociation = m_model.createObjectProperty( "http://www.w3.org/ns/prov#qualifiedAssociation" );
    
    /** <p>If this Entity prov:wasAttributedTo Agent :ag, then it can qualify how it 
     *  was influenced using prov:qualifiedAttribution [ a prov:Attribution; prov:agent 
     *  :ag; :foo :bar ].</p>
     */
    public static final ObjectProperty qualifiedAttribution = m_model.createObjectProperty( "http://www.w3.org/ns/prov#qualifiedAttribution" );
    
    /** <p>If this Activity prov:wasInformedBy Activity :a, then it can qualify how it 
     *  was influenced using prov:qualifiedCommunication [ a prov:Communication; prov:activity 
     *  :a; :foo :bar ].</p>
     */
    public static final ObjectProperty qualifiedCommunication = m_model.createObjectProperty( "http://www.w3.org/ns/prov#qualifiedCommunication" );
    
    /** <p>If this Agent prov:actedOnBehalfOf Agent :ag, then it can qualify how with 
     *  prov:qualifiedResponsibility [ a prov:Responsibility; prov:agent :ag; :foo 
     *  :bar ].</p>
     */
    public static final ObjectProperty qualifiedDelegation = m_model.createObjectProperty( "http://www.w3.org/ns/prov#qualifiedDelegation" );
    
    /** <p>If this Entity prov:wasDerivedFrom Entity :e, then it can qualify how it was 
     *  derived using prov:qualifiedDerivation [ a prov:Derivation; prov:entity :e; 
     *  :foo :bar ].</p>
     */
    public static final ObjectProperty qualifiedDerivation = m_model.createObjectProperty( "http://www.w3.org/ns/prov#qualifiedDerivation" );
    
    /** <p>If this Activity prov:wasEndedBy Entity :e1, then it can qualify how it was 
     *  ended using prov:qualifiedEnd [ a prov:End; prov:entity :e1; :foo :bar ].</p>
     */
    public static final ObjectProperty qualifiedEnd = m_model.createObjectProperty( "http://www.w3.org/ns/prov#qualifiedEnd" );
    
    /** <p>If this Activity prov:generated Entity :e, then it can qualify how it performed 
     *  the Generation using prov:qualifiedGeneration [ a prov:Generation; prov:entity 
     *  :e; :foo :bar ].</p>
     */
    public static final ObjectProperty qualifiedGeneration = m_model.createObjectProperty( "http://www.w3.org/ns/prov#qualifiedGeneration" );
    
    /** <p>Because prov:qualifiedInfluence is a broad relation, the more specific relations 
     *  (qualifiedCommunication, qualifiedDelegation, qualifiedEnd, etc.) should be 
     *  used when applicable.</p>
     */
    public static final ObjectProperty qualifiedInfluence = m_model.createObjectProperty( "http://www.w3.org/ns/prov#qualifiedInfluence" );
    
    /** <p>If this Entity prov:wasInvalidatedBy Activity :a, then it can qualify how 
     *  it was invalidated using prov:qualifiedInvalidation [ a prov:Invalidation; 
     *  prov:activity :a; :foo :bar ].</p>
     */
    public static final ObjectProperty qualifiedInvalidation = m_model.createObjectProperty( "http://www.w3.org/ns/prov#qualifiedInvalidation" );
    
    /** <p>If this Entity prov:hadPrimarySource Entity :e, then it can qualify how using 
     *  prov:qualifiedPrimarySource [ a prov:PrimarySource; prov:entity :e; :foo :bar 
     *  ].</p>
     */
    public static final ObjectProperty qualifiedPrimarySource = m_model.createObjectProperty( "http://www.w3.org/ns/prov#qualifiedPrimarySource" );
    
    /** <p>If this Entity prov:wasQuotedFrom Entity :e, then it can qualify how using 
     *  prov:qualifiedQuotation [ a prov:Quotation; prov:entity :e; :foo :bar ].</p>
     */
    public static final ObjectProperty qualifiedQuotation = m_model.createObjectProperty( "http://www.w3.org/ns/prov#qualifiedQuotation" );
    
    /** <p>If this Entity prov:wasRevisionOf Entity :e, then it can qualify how it was 
     *  revised using prov:qualifiedRevision [ a prov:Revision; prov:entity :e; :foo 
     *  :bar ].</p>
     */
    public static final ObjectProperty qualifiedRevision = m_model.createObjectProperty( "http://www.w3.org/ns/prov#qualifiedRevision" );
    
    /** <p>If this Activity prov:wasStartedBy Entity :e1, then it can qualify how it 
     *  was started using prov:qualifiedStart [ a prov:Start; prov:entity :e1; :foo 
     *  :bar ].</p>
     */
    public static final ObjectProperty qualifiedStart = m_model.createObjectProperty( "http://www.w3.org/ns/prov#qualifiedStart" );
    
    /** <p>If this Activity prov:used Entity :e, then it can qualify how it used it using 
     *  prov:qualifiedUsage [ a prov:Usage; prov:entity :e; :foo :bar ].</p>
     */
    public static final ObjectProperty qualifiedUsage = m_model.createObjectProperty( "http://www.w3.org/ns/prov#qualifiedUsage" );
    
    public static final ObjectProperty specializationOf = m_model.createObjectProperty( "http://www.w3.org/ns/prov#specializationOf" );
    
    /** <p>A prov:Entity that was used by this prov:Activity. For example, :baking prov:used 
     *  :spoon, :egg, :oven .</p>
     */
    public static final ObjectProperty used = m_model.createObjectProperty( "http://www.w3.org/ns/prov#used" );
    
    /** <p>An prov:Agent that had some (unspecified) responsibility for the occurrence 
     *  of this prov:Activity.</p>
     */
    public static final ObjectProperty wasAssociatedWith = m_model.createObjectProperty( "http://www.w3.org/ns/prov#wasAssociatedWith" );
    
    /** <p>Attribution is the ascribing of an entity to an agent.</p> */
    public static final ObjectProperty wasAttributedTo = m_model.createObjectProperty( "http://www.w3.org/ns/prov#wasAttributedTo" );
    
    /** <p>The more specific subproperties of prov:wasDerivedFrom (i.e., prov:wasQuotedFrom, 
     *  prov:wasRevisionOf, prov:hadPrimarySource) should be used when applicable.</p>
     */
    public static final ObjectProperty wasDerivedFrom = m_model.createObjectProperty( "http://www.w3.org/ns/prov#wasDerivedFrom" );
    
    /** <p>End is when an activity is deemed to have ended. An end may refer to an entity, 
     *  known as trigger, that terminated the activity.</p>
     */
    public static final ObjectProperty wasEndedBy = m_model.createObjectProperty( "http://www.w3.org/ns/prov#wasEndedBy" );
    
    public static final ObjectProperty wasGeneratedBy = m_model.createObjectProperty( "http://www.w3.org/ns/prov#wasGeneratedBy" );
    
    /** <p>Because prov:wasInfluencedBy is a broad relation, its more specific subproperties 
     *  (e.g. prov:wasInformedBy, prov:actedOnBehalfOf, prov:wasEndedBy, etc.) should 
     *  be used when applicable.This property has multiple RDFS domains to suit multiple 
     *  OWL Profiles. See &lt;a href="#prov-o-owl-profile"&gt;PROV-O OWL Profile&lt;/a&gt;.</p>
     */
    public static final ObjectProperty wasInfluencedBy = m_model.createObjectProperty( "http://www.w3.org/ns/prov#wasInfluencedBy" );
    
    /** <p>An activity a2 is dependent on or informed by another activity a1, by way 
     *  of some unspecified entity that is generated by a1 and used by a2.</p>
     */
    public static final ObjectProperty wasInformedBy = m_model.createObjectProperty( "http://www.w3.org/ns/prov#wasInformedBy" );
    
    public static final ObjectProperty wasInvalidatedBy = m_model.createObjectProperty( "http://www.w3.org/ns/prov#wasInvalidatedBy" );
    
    /** <p>An entity is derived from an original entity by copying, or 'quoting', some 
     *  or all of it.</p>
     */
    public static final ObjectProperty wasQuotedFrom = m_model.createObjectProperty( "http://www.w3.org/ns/prov#wasQuotedFrom" );
    
    /** <p>A revision is a derivation that revises an entity into a revised version.</p> */
    public static final ObjectProperty wasRevisionOf = m_model.createObjectProperty( "http://www.w3.org/ns/prov#wasRevisionOf" );
    
    /** <p>Start is when an activity is deemed to have started. A start may refer to 
     *  an entity, known as trigger, that initiated the activity.</p>
     */
    public static final ObjectProperty wasStartedBy = m_model.createObjectProperty( "http://www.w3.org/ns/prov#wasStartedBy" );
    
    /** <p>The time at which an InstantaneousEvent occurred, in the form of xsd:dateTime.</p> */
    public static final DatatypeProperty atTime = m_model.createDatatypeProperty( "http://www.w3.org/ns/prov#atTime" );
    
    /** <p>The time at which an activity ended. See also prov:startedAtTime.</p> */
    public static final DatatypeProperty endedAtTime = m_model.createDatatypeProperty( "http://www.w3.org/ns/prov#endedAtTime" );
    
    /** <p>The time at which an entity was completely created and is available for use.</p> */
    public static final DatatypeProperty generatedAtTime = m_model.createDatatypeProperty( "http://www.w3.org/ns/prov#generatedAtTime" );
    
    /** <p>The time at which an entity was invalidated (i.e., no longer usable).</p> */
    public static final DatatypeProperty invalidatedAtTime = m_model.createDatatypeProperty( "http://www.w3.org/ns/prov#invalidatedAtTime" );
    
    /** <p>The time at which an activity started. See also prov:endedAtTime.</p> */
    public static final DatatypeProperty startedAtTime = m_model.createDatatypeProperty( "http://www.w3.org/ns/prov#startedAtTime" );
    
    /** <p>Provides a value for an Entity.</p> */
    public static final DatatypeProperty value = m_model.createDatatypeProperty( "http://www.w3.org/ns/prov#value" );
    
    public static final AnnotationProperty aq = m_model.createAnnotationProperty( "http://www.w3.org/ns/prov#aq" );
    
    /** <p>Classify prov-o terms into three categories, including 'starting-point', 'qualifed', 
     *  and 'extended'. This classification is used by the prov-o html document to 
     *  gently introduce prov-o terms to its users.</p>
     */
    public static final AnnotationProperty category = m_model.createAnnotationProperty( "http://www.w3.org/ns/prov#category" );
    
    /** <p>Classify prov-o terms into six components according to prov-dm, including 
     *  'agents-responsibility', 'alternate', 'annotations', 'collections', 'derivations', 
     *  and 'entities-activities'. This classification is used so that readers of 
     *  prov-o specification can find its correspondence with the prov-dm specification.</p>
     */
    public static final AnnotationProperty component = m_model.createAnnotationProperty( "http://www.w3.org/ns/prov#component" );
    
    /** <p>A reference to the principal section of the PROV-CONSTRAINTS document that 
     *  describes this concept.</p>
     */
    public static final AnnotationProperty constraints = m_model.createAnnotationProperty( "http://www.w3.org/ns/prov#constraints" );
    
    /** <p>A definition quoted from PROV-DM or PROV-CONSTRAINTS that describes the concept 
     *  expressed with this OWL term.</p>
     */
    public static final AnnotationProperty definition = m_model.createAnnotationProperty( "http://www.w3.org/ns/prov#definition" );
    
    /** <p>A reference to the principal section of the PROV-DM document that describes 
     *  this concept.</p>
     */
    public static final AnnotationProperty dm = m_model.createAnnotationProperty( "http://www.w3.org/ns/prov#dm" );
    
    /** <p>A note by the OWL development team about how this term expresses the PROV-DM 
     *  concept, or how it should be used in context of semantic web or linked data.</p>
     */
    public static final AnnotationProperty editorialNote = m_model.createAnnotationProperty( "http://www.w3.org/ns/prov#editorialNote" );
    
    /** <p>When the prov-o term does not have a definition drawn from prov-dm, and the 
     *  prov-o editor provides one.</p>
     */
    public static final AnnotationProperty editorsDefinition = m_model.createAnnotationProperty( "http://www.w3.org/ns/prov#editorsDefinition" );
    
    /** <p>PROV-O does not define all property inverses. The directionalities defined 
     *  in PROV-O should be given preference over those not defined. However, if users 
     *  wish to name the inverse of a PROV-O property, the local name given by prov:inverse 
     *  should be used.</p>
     */
    public static final AnnotationProperty inverse = m_model.createAnnotationProperty( "http://www.w3.org/ns/prov#inverse" );
    
    /** <p>A reference to the principal section of the PROV-DM document that describes 
     *  this concept.</p>
     */
    public static final AnnotationProperty n = m_model.createAnnotationProperty( "http://www.w3.org/ns/prov#n" );
    
    /** <p>The position that this OWL term should be listed within documentation. The 
     *  scope of the documentation (e.g., among all terms, among terms within a prov:category, 
     *  among properties applying to a particular class, etc.) is unspecified.</p>
     */
    public static final AnnotationProperty order = m_model.createAnnotationProperty( "http://www.w3.org/ns/prov#order" );
    
    /** <p>This annotation property links a subproperty of prov:wasInfluencedBy with 
     *  the subclass of prov:Influence and the qualifying property that are used to 
     *  qualify it. Example annotation: prov:wasGeneratedBy prov:qualifiedForm prov:qualifiedGeneration, 
     *  prov:Generation . Then this unqualified assertion: :entity1 prov:wasGeneratedBy 
     *  :activity1 . can be qualified by adding: :entity1 prov:qualifiedGeneration 
     *  :entity1Gen . :entity1Gen a prov:Generation, prov:Influence; prov:activity 
     *  :activity1; :customValue 1337 . Note how the value of the unqualified influence 
     *  (prov:wasGeneratedBy :activity1) is mirrored as the value of the prov:activity 
     *  (or prov:entity, or prov:agent) property on the influence class.</p>
     */
    public static final AnnotationProperty qualifiedForm = m_model.createAnnotationProperty( "http://www.w3.org/ns/prov#qualifiedForm" );
    
    public static final AnnotationProperty sharesDefinitionWith = m_model.createAnnotationProperty( "http://www.w3.org/ns/prov#sharesDefinitionWith" );
    
    public static final AnnotationProperty todo = m_model.createAnnotationProperty( "http://www.w3.org/ns/prov#todo" );
    
    /** <p>Classes and properties used to qualify relationships are annotated with prov:unqualifiedForm 
     *  to indicate the property used to assert an unqualified provenance relation.</p>
     */
    public static final AnnotationProperty unqualifiedForm = m_model.createAnnotationProperty( "http://www.w3.org/ns/prov#unqualifiedForm" );
    
    public static final OntClass Activity = m_model.createClass( "http://www.w3.org/ns/prov#Activity" );
    
    /** <p>ActivityInfluence provides additional descriptions of an Activity's binary 
     *  influence upon any other kind of resource. Instances of ActivityInfluence 
     *  use the prov:activity property to cite the influencing Activity.It is not 
     *  recommended that the type ActivityInfluence be asserted without also asserting 
     *  one of its more specific subclasses.</p>
     */
    public static final OntClass ActivityInfluence = m_model.createClass( "http://www.w3.org/ns/prov#ActivityInfluence" );
    
    public static final OntClass Agent = m_model.createClass( "http://www.w3.org/ns/prov#Agent" );
    
    /** <p>It is not recommended that the type AgentInfluence be asserted without also 
     *  asserting one of its more specific subclasses.AgentInfluence provides additional 
     *  descriptions of an Agent's binary influence upon any other kind of resource. 
     *  Instances of AgentInfluence use the prov:agent property to cite the influencing 
     *  Agent.</p>
     */
    public static final OntClass AgentInfluence = m_model.createClass( "http://www.w3.org/ns/prov#AgentInfluence" );
    
    /** <p>An instance of prov:Association provides additional descriptions about the 
     *  binary prov:wasAssociatedWith relation from an prov:Activity to some prov:Agent 
     *  that had some responsiblity for it. For example, :baking prov:wasAssociatedWith 
     *  :baker; prov:qualifiedAssociation [ a prov:Association; prov:agent :baker; 
     *  :foo :bar ].</p>
     */
    public static final OntClass Association = m_model.createClass( "http://www.w3.org/ns/prov#Association" );
    
    /** <p>An instance of prov:Attribution provides additional descriptions about the 
     *  binary prov:wasAttributedTo relation from an prov:Entity to some prov:Agent 
     *  that had some responsible for it. For example, :cake prov:wasAttributedTo 
     *  :baker; prov:qualifiedAttribution [ a prov:Attribution; prov:entity :baker; 
     *  :foo :bar ].</p>
     */
    public static final OntClass Attribution = m_model.createClass( "http://www.w3.org/ns/prov#Attribution" );
    
    /** <p>Note that there are kinds of bundles (e.g. handwritten letters, audio recordings, 
     *  etc.) that are not expressed in PROV-O, but can be still be described by PROV-O.</p>
     */
    public static final OntClass Bundle = m_model.createClass( "http://www.w3.org/ns/prov#Bundle" );
    
    public static final OntClass Collection = m_model.createClass( "http://www.w3.org/ns/prov#Collection" );
    
    /** <p>An instance of prov:Communication provides additional descriptions about the 
     *  binary prov:wasInformedBy relation from an informed prov:Activity to the prov:Activity 
     *  that informed it. For example, :you_jumping_off_bridge prov:wasInformedBy 
     *  :everyone_else_jumping_off_bridge; prov:qualifiedCommunication [ a prov:Communication; 
     *  prov:activity :everyone_else_jumping_off_bridge; :foo :bar ].</p>
     */
    public static final OntClass Communication = m_model.createClass( "http://www.w3.org/ns/prov#Communication" );
    
    /** <p>An instance of prov:Delegation provides additional descriptions about the 
     *  binary prov:actedOnBehalfOf relation from a performing prov:Agent to some 
     *  prov:Agent for whom it was performed. For example, :mixing prov:wasAssociatedWith 
     *  :toddler . :toddler prov:actedOnBehalfOf :mother; prov:qualifiedDelegation 
     *  [ a prov:Delegation; prov:entity :mother; :foo :bar ].</p>
     */
    public static final OntClass Delegation = m_model.createClass( "http://www.w3.org/ns/prov#Delegation" );
    
    /** <p>The more specific forms of prov:Derivation (i.e., prov:Revision, prov:Quotation, 
     *  prov:PrimarySource) should be asserted if they apply.An instance of prov:Derivation 
     *  provides additional descriptions about the binary prov:wasDerivedFrom relation 
     *  from some derived prov:Entity to another prov:Entity from which it was derived. 
     *  For example, :chewed_bubble_gum prov:wasDerivedFrom :unwrapped_bubble_gum; 
     *  prov:qualifiedDerivation [ a prov:Derivation; prov:entity :unwrapped_bubble_gum; 
     *  :foo :bar ].</p>
     */
    public static final OntClass Derivation = m_model.createClass( "http://www.w3.org/ns/prov#Derivation" );
    
    public static final OntClass EmptyCollection = m_model.createClass( "http://www.w3.org/ns/prov#EmptyCollection" );
    
    /** <p>An instance of prov:End provides additional descriptions about the binary 
     *  prov:wasEndedBy relation from some ended prov:Activity to an prov:Entity that 
     *  ended it. For example, :ball_game prov:wasEndedBy :buzzer; prov:qualifiedEnd 
     *  [ a prov:End; prov:entity :buzzer; :foo :bar; prov:atTime '2012-03-09T08:05:08-05:00'^^xsd:dateTime 
     *  ].</p>
     */
    public static final OntClass End = m_model.createClass( "http://www.w3.org/ns/prov#End" );
    
    public static final OntClass Entity = m_model.createClass( "http://www.w3.org/ns/prov#Entity" );
    
    /** <p>It is not recommended that the type EntityInfluence be asserted without also 
     *  asserting one of its more specific subclasses.EntityInfluence provides additional 
     *  descriptions of an Entity's binary influence upon any other kind of resource. 
     *  Instances of EntityInfluence use the prov:entity property to cite the influencing 
     *  Entity.</p>
     */
    public static final OntClass EntityInfluence = m_model.createClass( "http://www.w3.org/ns/prov#EntityInfluence" );
    
    /** <p>An instance of prov:Generation provides additional descriptions about the 
     *  binary prov:wasGeneratedBy relation from a generated prov:Entity to the prov:Activity 
     *  that generated it. For example, :cake prov:wasGeneratedBy :baking; prov:qualifiedGeneration 
     *  [ a prov:Generation; prov:activity :baking; :foo :bar ].</p>
     */
    public static final OntClass Generation = m_model.createClass( "http://www.w3.org/ns/prov#Generation" );
    
    /** <p>An instance of prov:Influence provides additional descriptions about the binary 
     *  prov:wasInfluencedBy relation from some influenced Activity, Entity, or Agent 
     *  to the influencing Activity, Entity, or Agent. For example, :stomach_ache 
     *  prov:wasInfluencedBy :spoon; prov:qualifiedInfluence [ a prov:Influence; prov:entity 
     *  :spoon; :foo :bar ] . Because prov:Influence is a broad relation, the more 
     *  specific relations (Communication, Delegation, End, etc.) should be used when 
     *  applicable.Because prov:Influence is a broad relation, its most specific subclasses 
     *  (e.g. prov:Communication, prov:Delegation, prov:End, prov:Revision, etc.) 
     *  should be used when applicable.</p>
     */
    public static final OntClass Influence = m_model.createClass( "http://www.w3.org/ns/prov#Influence" );
    
    /** <p>An instantaneous event, or event for short, happens in the world and marks 
     *  a change in the world, in its activities and in its entities. The term 'event' 
     *  is commonly used in process algebra with a similar meaning. Events represent 
     *  communications or interactions; they are assumed to be atomic and instantaneous.</p>
     */
    public static final OntClass InstantaneousEvent = m_model.createClass( "http://www.w3.org/ns/prov#InstantaneousEvent" );
    
    /** <p>An instance of prov:Invalidation provides additional descriptions about the 
     *  binary prov:wasInvalidatedBy relation from an invalidated prov:Entity to the 
     *  prov:Activity that invalidated it. For example, :uncracked_egg prov:wasInvalidatedBy 
     *  :baking; prov:qualifiedInvalidation [ a prov:Invalidation; prov:activity :baking; 
     *  :foo :bar ].</p>
     */
    public static final OntClass Invalidation = m_model.createClass( "http://www.w3.org/ns/prov#Invalidation" );
    
    public static final OntClass Location = m_model.createClass( "http://www.w3.org/ns/prov#Location" );
    
    public static final OntClass Organization = m_model.createClass( "http://www.w3.org/ns/prov#Organization" );
    
    public static final OntClass Person = m_model.createClass( "http://www.w3.org/ns/prov#Person" );
    
    /** <p>There exist no prescriptive requirement on the nature of plans, their representation, 
     *  the actions or steps they consist of, or their intended goals. Since plans 
     *  may evolve over time, it may become necessary to track their provenance, so 
     *  plans themselves are entities. Representing the plan explicitly in the provenance 
     *  can be useful for various tasks: for example, to validate the execution as 
     *  represented in the provenance record, to manage expectation failures, or to 
     *  provide explanations.</p>
     */
    public static final OntClass Plan = m_model.createClass( "http://www.w3.org/ns/prov#Plan" );
    
    /** <p>An instance of prov:PrimarySource provides additional descriptions about the 
     *  binary prov:hadPrimarySource relation from some secondary prov:Entity to an 
     *  earlier, primary prov:Entity. For example, :blog prov:hadPrimarySource :newsArticle; 
     *  prov:qualifiedPrimarySource [ a prov:PrimarySource; prov:entity :newsArticle; 
     *  :foo :bar ] .</p>
     */
    public static final OntClass PrimarySource = m_model.createClass( "http://www.w3.org/ns/prov#PrimarySource" );
    
    /** <p>An instance of prov:Quotation provides additional descriptions about the binary 
     *  prov:wasQuotedFrom relation from some taken prov:Entity from an earlier, larger 
     *  prov:Entity. For example, :here_is_looking_at_you_kid prov:wasQuotedFrom :casablanca_script; 
     *  prov:qualifiedQuotation [ a prov:Quotation; prov:entity :casablanca_script; 
     *  :foo :bar ].</p>
     */
    public static final OntClass Quotation = m_model.createClass( "http://www.w3.org/ns/prov#Quotation" );
    
    /** <p>An instance of prov:Revision provides additional descriptions about the binary 
     *  prov:wasRevisionOf relation from some newer prov:Entity to an earlier prov:Entity. 
     *  For example, :draft_2 prov:wasRevisionOf :draft_1; prov:qualifiedRevision 
     *  [ a prov:Revision; prov:entity :draft_1; :foo :bar ].</p>
     */
    public static final OntClass Revision = m_model.createClass( "http://www.w3.org/ns/prov#Revision" );
    
    public static final OntClass Role = m_model.createClass( "http://www.w3.org/ns/prov#Role" );
    
    public static final OntClass SoftwareAgent = m_model.createClass( "http://www.w3.org/ns/prov#SoftwareAgent" );
    
    /** <p>An instance of prov:Start provides additional descriptions about the binary 
     *  prov:wasStartedBy relation from some started prov:Activity to an prov:Entity 
     *  that started it. For example, :foot_race prov:wasStartedBy :bang; prov:qualifiedStart 
     *  [ a prov:Start; prov:entity :bang; :foo :bar; prov:atTime '2012-03-09T08:05:08-05:00'^^xsd:dateTime 
     *  ] .</p>
     */
    public static final OntClass Start = m_model.createClass( "http://www.w3.org/ns/prov#Start" );
    
    /** <p>An instance of prov:Usage provides additional descriptions about the binary 
     *  prov:used relation from some prov:Activity to an prov:Entity that it used. 
     *  For example, :keynote prov:used :podium; prov:qualifiedUsage [ a prov:Usage; 
     *  prov:entity :podium; :foo :bar ].</p>
     */
    public static final OntClass Usage = m_model.createClass( "http://www.w3.org/ns/prov#Usage" );
    
}
