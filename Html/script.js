// Scene Setup
const scene = new THREE.Scene();
const camera = new THREE.PerspectiveCamera(75, window.innerWidth / window.innerHeight, 0.1, 1000);
const renderer = new THREE.WebGLRenderer({ antialias: true });
renderer.setSize(window.innerWidth, window.innerHeight);
document.body.appendChild(renderer.domElement);

// Lights
const ambientLight = new THREE.AmbientLight(0xffffff, 1);
scene.add(ambientLight);
const directionalLight = new THREE.DirectionalLight(0xffffff, 1);
directionalLight.position.set(5, 5, 5);
scene.add(directionalLight);

// Orbit Controls (For Interaction)
const controls = new THREE.OrbitControls(camera, renderer.domElement);
controls.enableDamping = true; // Smooth rotation
controls.dampingFactor = 0.05;
controls.screenSpacePanning = false;
controls.minDistance = 2;
controls.maxDistance = 10;

// Load GLB Model (Preferred)
const gltfLoader = new THREE.GLTFLoader();
gltfLoader.load(
    'free_1975_porsche_911_930_turbo.obj', // Change this to your file path
    function (gltf) {
        const model = gltf.scene;
        model.scale.set(1, 1, 1); // Adjust size
        model.position.set(0, -1, 0); // Adjust position
        scene.add(model);
    },
    function (xhr) {
        console.log((xhr.loaded / xhr.total) * 100 + '% loaded');
    },
    function (error) {
        console.error('Error loading GLB model:', error);
    }
);

// Alternative: Load OBJ Model
const objLoader = new THREE.OBJLoader();
objLoader.load(
    'models/model.obj', // Change this to your OBJ file path
    function (object) {
        object.scale.set(1, 1, 1);
        object.position.set(0, -1, 0);
        scene.add(object);
    },
    function (xhr) {
        console.log((xhr.loaded / xhr.total) * 100 + '% loaded');
    },
    function (error) {
        console.error('Error loading OBJ model:', error);
    }
);

// Set Camera Position
camera.position.set(0, 1, 5);

// Animation Loop
function animate() {
    requestAnimationFrame(animate);
    controls.update();
    renderer.render(scene, camera);
}
animate();

// Handle Resizing
window.addEventListener('resize', function () {
    const width = window.innerWidth;
    const height = window.innerHeight;
    renderer.setSize(width, height);
    camera.aspect = width / height;
    camera.updateProjectionMatrix();
});
