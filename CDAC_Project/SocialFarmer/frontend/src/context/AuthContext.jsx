import { createContext, useState, useEffect, useContext } from 'react';
import { jwtDecode } from "jwt-decode";
import api from '../api/axios';

const AuthContext = createContext();

export const useAuth = () => useContext(AuthContext);

export const AuthProvider = ({ children }) => {
    const [user, setUser] = useState(null);
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        const token = localStorage.getItem('token');
        if (token) {
            try {
                const decoded = jwtDecode(token);
                // Check expiry
                if (decoded.exp * 1000 < Date.now()) {
                    logout();
                } else {
                    setUser({ sub: decoded.sub, role: decoded.role }); // Ensure backend sends role in token or fetch user profile
                }
            } catch (e) {
                logout();
            }
        }
        setLoading(false);
    }, []);

    const login = async (phoneNumber, otp) => {
        const res = await api.post('/auth/authenticate', { phoneNumber, otp });
        const { token } = res.data;
        localStorage.setItem('token', token);
        const decoded = jwtDecode(token);
        setUser({ sub: decoded.sub }); // Adjust based on token structure
        return res.data;
    };

    const register = async (data) => {
        return await api.post('/auth/register', data);
    };

    const logout = () => {
        localStorage.removeItem('token');
        setUser(null);
    };

    return (
        <AuthContext.Provider value={{ user, login, register, logout, loading }}>
            {children}
        </AuthContext.Provider>
    );
};
