/**
 */
package metaSDL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see metaSDL.MetaSDLFactory
 * @model kind="package"
 * @generated
 */
public interface MetaSDLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metaSDL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/metaSDL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metaSDL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetaSDLPackage eINSTANCE = metaSDL.impl.MetaSDLPackageImpl.init();

	/**
	 * The meta object id for the '{@link metaSDL.impl.ProcessusImpl <em>Processus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaSDL.impl.ProcessusImpl
	 * @see metaSDL.impl.MetaSDLPackageImpl#getProcessus()
	 * @generated
	 */
	int PROCESSUS = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__STATE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__ID = 1;

	/**
	 * The number of structural features of the '<em>Processus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Processus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaSDL.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaSDL.impl.BlockImpl
	 * @see metaSDL.impl.MetaSDLPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Canalblock</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CANALBLOCK = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ID = 1;

	/**
	 * The feature id for the '<em><b>Processus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__PROCESSUS = 2;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaSDL.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaSDL.impl.SignalImpl
	 * @see metaSDL.impl.MetaSDLPackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__ID = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__FROM = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__TO = 2;

	/**
	 * The feature id for the '<em><b>With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__WITH = 3;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaSDL.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaSDL.impl.StateImpl
	 * @see metaSDL.impl.MetaSDLPackageImpl#getState()
	 * @generated
	 */
	int STATE = 3;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STATE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ID = 1;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SIGNAL = 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaSDL.impl.CanalSysImpl <em>Canal Sys</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaSDL.impl.CanalSysImpl
	 * @see metaSDL.impl.MetaSDLPackageImpl#getCanalSys()
	 * @generated
	 */
	int CANAL_SYS = 4;

	/**
	 * The feature id for the '<em><b>Canalsys</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANAL_SYS__CANALSYS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANAL_SYS__ID = 1;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANAL_SYS__SIGNAL = 2;

	/**
	 * The number of structural features of the '<em>Canal Sys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANAL_SYS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Canal Sys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANAL_SYS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaSDL.impl.CanalBlockImpl <em>Canal Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaSDL.impl.CanalBlockImpl
	 * @see metaSDL.impl.MetaSDLPackageImpl#getCanalBlock()
	 * @generated
	 */
	int CANAL_BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Processus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANAL_BLOCK__PROCESSUS = 0;

	/**
	 * The feature id for the '<em><b>Canalblock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANAL_BLOCK__CANALBLOCK = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANAL_BLOCK__ID = 2;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANAL_BLOCK__SIGNAL = 3;

	/**
	 * The number of structural features of the '<em>Canal Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANAL_BLOCK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Canal Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANAL_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaSDL.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaSDL.impl.ConnectionImpl
	 * @see metaSDL.impl.MetaSDLPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 6;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__OUTPUT = 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaSDL.impl.MetaSysSDLImpl <em>Meta Sys SDL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaSDL.impl.MetaSysSDLImpl
	 * @see metaSDL.impl.MetaSDLPackageImpl#getMetaSysSDL()
	 * @generated
	 */
	int META_SYS_SDL = 7;

	/**
	 * The feature id for the '<em><b>Canalsys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_SYS_SDL__CANALSYS = 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_SYS_SDL__BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_SYS_SDL__SIGNAL = 2;

	/**
	 * The feature id for the '<em><b>Processus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_SYS_SDL__PROCESSUS = 3;

	/**
	 * The feature id for the '<em><b>Name Sys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_SYS_SDL__NAME_SYS = 4;

	/**
	 * The number of structural features of the '<em>Meta Sys SDL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_SYS_SDL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Meta Sys SDL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_SYS_SDL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link metaSDL.Processus <em>Processus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processus</em>'.
	 * @see metaSDL.Processus
	 * @generated
	 */
	EClass getProcessus();

	/**
	 * Returns the meta object for the containment reference list '{@link metaSDL.Processus#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see metaSDL.Processus#getState()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_State();

	/**
	 * Returns the meta object for the attribute '{@link metaSDL.Processus#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see metaSDL.Processus#getId()
	 * @see #getProcessus()
	 * @generated
	 */
	EAttribute getProcessus_Id();

	/**
	 * Returns the meta object for class '{@link metaSDL.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see metaSDL.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link metaSDL.Block#getProcessus <em>Processus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processus</em>'.
	 * @see metaSDL.Block#getProcessus()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Processus();

	/**
	 * Returns the meta object for the containment reference list '{@link metaSDL.Block#getCanalblock <em>Canalblock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Canalblock</em>'.
	 * @see metaSDL.Block#getCanalblock()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Canalblock();

	/**
	 * Returns the meta object for the attribute '{@link metaSDL.Block#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see metaSDL.Block#getId()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Id();

	/**
	 * Returns the meta object for class '{@link metaSDL.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see metaSDL.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the attribute '{@link metaSDL.Signal#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see metaSDL.Signal#getId()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_Id();

	/**
	 * Returns the meta object for the attribute '{@link metaSDL.Signal#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see metaSDL.Signal#getFrom()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_From();

	/**
	 * Returns the meta object for the attribute '{@link metaSDL.Signal#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see metaSDL.Signal#getTo()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_To();

	/**
	 * Returns the meta object for the attribute '{@link metaSDL.Signal#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With</em>'.
	 * @see metaSDL.Signal#getWith()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_With();

	/**
	 * Returns the meta object for class '{@link metaSDL.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see metaSDL.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference '{@link metaSDL.State#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see metaSDL.State#getState()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_State();

	/**
	 * Returns the meta object for the attribute '{@link metaSDL.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see metaSDL.State#getId()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link metaSDL.State#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signal</em>'.
	 * @see metaSDL.State#getSignal()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Signal();

	/**
	 * Returns the meta object for the containment reference list '{@link metaSDL.State#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see metaSDL.State#getConnection()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Connection();

	/**
	 * Returns the meta object for class '{@link metaSDL.CanalSys <em>Canal Sys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canal Sys</em>'.
	 * @see metaSDL.CanalSys
	 * @generated
	 */
	EClass getCanalSys();

	/**
	 * Returns the meta object for the containment reference list '{@link metaSDL.CanalSys#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signal</em>'.
	 * @see metaSDL.CanalSys#getSignal()
	 * @see #getCanalSys()
	 * @generated
	 */
	EReference getCanalSys_Signal();

	/**
	 * Returns the meta object for the reference '{@link metaSDL.CanalSys#getCanalsys <em>Canalsys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Canalsys</em>'.
	 * @see metaSDL.CanalSys#getCanalsys()
	 * @see #getCanalSys()
	 * @generated
	 */
	EReference getCanalSys_Canalsys();

	/**
	 * Returns the meta object for the attribute '{@link metaSDL.CanalSys#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see metaSDL.CanalSys#getId()
	 * @see #getCanalSys()
	 * @generated
	 */
	EAttribute getCanalSys_Id();

	/**
	 * Returns the meta object for class '{@link metaSDL.CanalBlock <em>Canal Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canal Block</em>'.
	 * @see metaSDL.CanalBlock
	 * @generated
	 */
	EClass getCanalBlock();

	/**
	 * Returns the meta object for the reference '{@link metaSDL.CanalBlock#getProcessus <em>Processus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processus</em>'.
	 * @see metaSDL.CanalBlock#getProcessus()
	 * @see #getCanalBlock()
	 * @generated
	 */
	EReference getCanalBlock_Processus();

	/**
	 * Returns the meta object for the reference '{@link metaSDL.CanalBlock#getCanalblock <em>Canalblock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Canalblock</em>'.
	 * @see metaSDL.CanalBlock#getCanalblock()
	 * @see #getCanalBlock()
	 * @generated
	 */
	EReference getCanalBlock_Canalblock();

	/**
	 * Returns the meta object for the containment reference list '{@link metaSDL.CanalBlock#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signal</em>'.
	 * @see metaSDL.CanalBlock#getSignal()
	 * @see #getCanalBlock()
	 * @generated
	 */
	EReference getCanalBlock_Signal();

	/**
	 * Returns the meta object for the attribute '{@link metaSDL.CanalBlock#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see metaSDL.CanalBlock#getId()
	 * @see #getCanalBlock()
	 * @generated
	 */
	EAttribute getCanalBlock_Id();

	/**
	 * Returns the meta object for class '{@link metaSDL.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see metaSDL.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link metaSDL.Connection#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see metaSDL.Connection#getInput()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Input();

	/**
	 * Returns the meta object for the attribute '{@link metaSDL.Connection#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see metaSDL.Connection#getOutput()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Output();

	/**
	 * Returns the meta object for class '{@link metaSDL.MetaSysSDL <em>Meta Sys SDL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Sys SDL</em>'.
	 * @see metaSDL.MetaSysSDL
	 * @generated
	 */
	EClass getMetaSysSDL();

	/**
	 * Returns the meta object for the containment reference list '{@link metaSDL.MetaSysSDL#getCanalsys <em>Canalsys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Canalsys</em>'.
	 * @see metaSDL.MetaSysSDL#getCanalsys()
	 * @see #getMetaSysSDL()
	 * @generated
	 */
	EReference getMetaSysSDL_Canalsys();

	/**
	 * Returns the meta object for the containment reference list '{@link metaSDL.MetaSysSDL#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block</em>'.
	 * @see metaSDL.MetaSysSDL#getBlock()
	 * @see #getMetaSysSDL()
	 * @generated
	 */
	EReference getMetaSysSDL_Block();

	/**
	 * Returns the meta object for the containment reference list '{@link metaSDL.MetaSysSDL#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signal</em>'.
	 * @see metaSDL.MetaSysSDL#getSignal()
	 * @see #getMetaSysSDL()
	 * @generated
	 */
	EReference getMetaSysSDL_Signal();

	/**
	 * Returns the meta object for the containment reference list '{@link metaSDL.MetaSysSDL#getProcessus <em>Processus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processus</em>'.
	 * @see metaSDL.MetaSysSDL#getProcessus()
	 * @see #getMetaSysSDL()
	 * @generated
	 */
	EReference getMetaSysSDL_Processus();

	/**
	 * Returns the meta object for the attribute '{@link metaSDL.MetaSysSDL#getNameSys <em>Name Sys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Sys</em>'.
	 * @see metaSDL.MetaSysSDL#getNameSys()
	 * @see #getMetaSysSDL()
	 * @generated
	 */
	EAttribute getMetaSysSDL_NameSys();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetaSDLFactory getMetaSDLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link metaSDL.impl.ProcessusImpl <em>Processus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaSDL.impl.ProcessusImpl
		 * @see metaSDL.impl.MetaSDLPackageImpl#getProcessus()
		 * @generated
		 */
		EClass PROCESSUS = eINSTANCE.getProcessus();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSUS__STATE = eINSTANCE.getProcessus_State();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSUS__ID = eINSTANCE.getProcessus_Id();

		/**
		 * The meta object literal for the '{@link metaSDL.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaSDL.impl.BlockImpl
		 * @see metaSDL.impl.MetaSDLPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Processus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__PROCESSUS = eINSTANCE.getBlock_Processus();

		/**
		 * The meta object literal for the '<em><b>Canalblock</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__CANALBLOCK = eINSTANCE.getBlock_Canalblock();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__ID = eINSTANCE.getBlock_Id();

		/**
		 * The meta object literal for the '{@link metaSDL.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaSDL.impl.SignalImpl
		 * @see metaSDL.impl.MetaSDLPackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__ID = eINSTANCE.getSignal_Id();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__FROM = eINSTANCE.getSignal_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__TO = eINSTANCE.getSignal_To();

		/**
		 * The meta object literal for the '<em><b>With</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__WITH = eINSTANCE.getSignal_With();

		/**
		 * The meta object literal for the '{@link metaSDL.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaSDL.impl.StateImpl
		 * @see metaSDL.impl.MetaSDLPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STATE = eINSTANCE.getState_State();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__SIGNAL = eINSTANCE.getState_Signal();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__CONNECTION = eINSTANCE.getState_Connection();

		/**
		 * The meta object literal for the '{@link metaSDL.impl.CanalSysImpl <em>Canal Sys</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaSDL.impl.CanalSysImpl
		 * @see metaSDL.impl.MetaSDLPackageImpl#getCanalSys()
		 * @generated
		 */
		EClass CANAL_SYS = eINSTANCE.getCanalSys();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANAL_SYS__SIGNAL = eINSTANCE.getCanalSys_Signal();

		/**
		 * The meta object literal for the '<em><b>Canalsys</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANAL_SYS__CANALSYS = eINSTANCE.getCanalSys_Canalsys();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANAL_SYS__ID = eINSTANCE.getCanalSys_Id();

		/**
		 * The meta object literal for the '{@link metaSDL.impl.CanalBlockImpl <em>Canal Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaSDL.impl.CanalBlockImpl
		 * @see metaSDL.impl.MetaSDLPackageImpl#getCanalBlock()
		 * @generated
		 */
		EClass CANAL_BLOCK = eINSTANCE.getCanalBlock();

		/**
		 * The meta object literal for the '<em><b>Processus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANAL_BLOCK__PROCESSUS = eINSTANCE.getCanalBlock_Processus();

		/**
		 * The meta object literal for the '<em><b>Canalblock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANAL_BLOCK__CANALBLOCK = eINSTANCE.getCanalBlock_Canalblock();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANAL_BLOCK__SIGNAL = eINSTANCE.getCanalBlock_Signal();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANAL_BLOCK__ID = eINSTANCE.getCanalBlock_Id();

		/**
		 * The meta object literal for the '{@link metaSDL.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaSDL.impl.ConnectionImpl
		 * @see metaSDL.impl.MetaSDLPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__INPUT = eINSTANCE.getConnection_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__OUTPUT = eINSTANCE.getConnection_Output();

		/**
		 * The meta object literal for the '{@link metaSDL.impl.MetaSysSDLImpl <em>Meta Sys SDL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaSDL.impl.MetaSysSDLImpl
		 * @see metaSDL.impl.MetaSDLPackageImpl#getMetaSysSDL()
		 * @generated
		 */
		EClass META_SYS_SDL = eINSTANCE.getMetaSysSDL();

		/**
		 * The meta object literal for the '<em><b>Canalsys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_SYS_SDL__CANALSYS = eINSTANCE.getMetaSysSDL_Canalsys();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_SYS_SDL__BLOCK = eINSTANCE.getMetaSysSDL_Block();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_SYS_SDL__SIGNAL = eINSTANCE.getMetaSysSDL_Signal();

		/**
		 * The meta object literal for the '<em><b>Processus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_SYS_SDL__PROCESSUS = eINSTANCE.getMetaSysSDL_Processus();

		/**
		 * The meta object literal for the '<em><b>Name Sys</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_SYS_SDL__NAME_SYS = eINSTANCE.getMetaSysSDL_NameSys();

	}

} //MetaSDLPackage
