# FROM node:12 AS build

# WORKDIR /app

# COPY package*.json ./
# COPY postcss.config.js ./
# COPY rollup.config.js ./
# COPY tailwind.config.js ./
# RUN npm install

# COPY ./src ./src
# COPY ./public ./public

# RUN npm run build

# FROM nginx:1.19-alpine
# EXPOSE 80
# COPY --from=build /app/public /usr/share/nginx/html

FROM node:12-alpine
WORKDIR /usr/src/app
COPY package*.json ./
RUN npm install
COPY . .
EXPOSE 5000
ENV HOST=0.0.0.0
CMD ["npm", "run", "dev"]