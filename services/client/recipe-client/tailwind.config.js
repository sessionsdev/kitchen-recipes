module.exports = {
    purge: ["./src/**/*.html", "./src/**/*.js"],
    darkMode: false, // or 'media' or 'class'
    theme: {
        extend: {
          colors: {
            primary: '#FF6363',
            secondary: {
              100: '#E2E2D5',
              200: '#888883'
            }
          },
          fontFamily: {
            primary: ['Nunito']

          }
        },
    },
    variants: {
      extend: {},
    },
    plugins: [],
  };
  