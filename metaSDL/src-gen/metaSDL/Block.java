/**
 */
package metaSDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaSDL.Block#getCanalblock <em>Canalblock</em>}</li>
 *   <li>{@link metaSDL.Block#getId <em>Id</em>}</li>
 *   <li>{@link metaSDL.Block#getProcessus <em>Processus</em>}</li>
 * </ul>
 *
 * @see metaSDL.MetaSDLPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject {
	/**
	 * Returns the value of the '<em><b>Processus</b></em>' containment reference list.
	 * The list contents are of type {@link metaSDL.Processus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processus</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processus</em>' containment reference list.
	 * @see metaSDL.MetaSDLPackage#getBlock_Processus()
	 * @model containment="true"
	 * @generated
	 */
	EList<Processus> getProcessus();

	/**
	 * Returns the value of the '<em><b>Canalblock</b></em>' containment reference list.
	 * The list contents are of type {@link metaSDL.CanalBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canalblock</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canalblock</em>' containment reference list.
	 * @see metaSDL.MetaSDLPackage#getBlock_Canalblock()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CanalBlock> getCanalblock();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see metaSDL.MetaSDLPackage#getBlock_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link metaSDL.Block#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Block
