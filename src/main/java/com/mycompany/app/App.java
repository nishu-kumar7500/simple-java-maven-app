export default function LoginPage() {
  return (
    <div className="flex items-center justify-center min-h-screen bg-gray-100">
      <div className="w-full max-w-md bg-white rounded-2xl shadow-lg p-8">
        <h2 className="text-2xl font-bold text-center text-gray-800 mb-6">
          Login to Your Account
        </h2>
        <form className="space-y-5">
          <div>
            <label htmlFor="email" className="block text-sm font-medium text-gray-700">
              Email Address
            </label>
            <input
              type="email"
              id="email"
              placeholder="you@example.com"
              className="mt-2 w-full px-4 py-2 border rounded-lg shadow-sm focus:ring focus:ring-blue-200 focus:outline-none"
              required
            />
          </div>

          <div>
            <label htmlFor="password" className="block text-sm font-medium text-gray-700">
              Password
            </label>
            <input
              type="password"
              id="password"
              placeholder="••••••••"
              className="mt-2 w-full px-4 py-2 border rounded-lg shadow-sm focus:ring focus:ring-blue-200 focus:outline-none"
              required
            />
          </div>

          <div className="flex items-center justify-between">
            <label className="flex items-center text-sm">
              <input type="checkbox" className="mr-2" /> Remember me
            </label>
            <a href="#" className="text-sm text-blue-600 hover:underline">
              Forgot password?
            </a>
          </div>

          <button
            type="submit"
            className="w-full bg-blue-600 text-white py-2 rounded-lg shadow-md hover:bg-blue-700 transition"
          >
            Sign In
          </button>
        </form>

        <p className="text-sm text-center text-gray-600 mt-6">
          Don’t have an account?{" "}
          <a href="#" className="text-blue-600 hover:underline">
            Sign up
          </a>
        </p>
      </div>
    </div>
  );
}
